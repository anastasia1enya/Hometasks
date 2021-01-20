package HW15;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;

import java.util.Map;

public class Converter {

    private long time = System.currentTimeMillis();

    //метод определения расширения файла
    public String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

    //метод вырезания названия
    public String сutFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.contains("."))
            return fileName.substring(0, fileName.indexOf("."));
        else return "";
    }

    public void type(File file, String path) throws IOException {
// from JSON to YML
        if (getFileExtension(file).equals("json")) {
            String json = ReadFromFile.readToString(path);
            Yaml yaml = new Yaml();
            Gson gson = new Gson();

            Map map = gson.fromJson(json, Map.class);


            String outputYaml = yaml.dump(map);
            System.out.println(outputYaml);

            Long timeFile = System.currentTimeMillis() - time;
            save1(file, outputYaml);
            results(file, save1(file, outputYaml), timeFile);

// from  YML to JSON
        } else if (getFileExtension(file).equals("yaml")) {

            String yml = ReadFromFile.readToString(path);
            Yaml yaml = new Yaml();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Object obj = yaml.load(yml);
            String obj1 = gson.toJson(obj);
            System.out.println(obj1);

            Long timeFile = System.currentTimeMillis() - time;
            save1(file, obj1);
            results(file, save1(file, obj1), timeFile);

        } else {
            System.out.println("Your file is wrong");
            try (FileWriter fileNew = new FileWriter(((FileSystems.getDefault()
                    .getPath("")
                    .toAbsolutePath()
                    .toString()
                    + "\\src\\main\\java\\HW15\\") + "results.text"), true)) {
                fileNew.write("No converataion possible");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // сохраняем новые файлы
    public File save1(File file, String str) {
        String pathNew = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\СonverteeedFiles\\";
        if (getFileExtension(file).equals("json")) {
            try (FileWriter fileNew = new FileWriter(((pathNew) + сutFileExtension(file) + ".yaml"), true)) {

                fileNew.write(str);
                return new File(((pathNew) + сutFileExtension(file)) + ".yaml");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (getFileExtension(file).equals("yaml")) {

            try (FileWriter fileNew = new FileWriter(((pathNew) + сutFileExtension(file) + ".json"), true)) {

                fileNew.write(str);
                return new File(((pathNew) + сutFileExtension(file)) + ".json");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    // вывод результатов
    public void results(File file, File file1, Long timeFile) {

        try (FileWriter fileNew = new FileWriter(((FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\") + "results.text"), true)) {

            fileNew.write("The old name of file is " + file.getName() + " \n");
            fileNew.write("The old size of file is " + file.length() + " bytes \n");
            fileNew.write("The new name of file is " + file1.getName() + " \n");
            fileNew.write("The  new size of file is " + file1.length() + " bytes \n");
            fileNew.write("The time of operation is : " + timeFile + " mseconds\n");
            fileNew.write("--------------------\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
