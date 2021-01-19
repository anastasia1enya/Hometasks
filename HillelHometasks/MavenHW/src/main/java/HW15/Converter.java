package HW15;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Map;

public class Converter {


    //метод определения расширения файла
    public  String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") +1);
        else return "";
    }
//метод вырезания названия
    public  String сutFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.contains(".") )
            return fileName.substring(0,fileName.indexOf("."));
        else return "";
    }

    public  void type(File file, String path) throws IOException {
// from JSON to YML
        if (getFileExtension(file).equals("json")) {
            String json = ReadFromFile.readToString(path);
            Yaml yaml = new Yaml();
            Gson gson = new Gson();

            Map map = gson.fromJson(json, Map.class);

            // System.out.println(map);
            String outputYaml = yaml.dump(map);
            System.out.println(outputYaml);

            System.out.println(file.getTotalSpace()/(1024*1024));

// saving new files
            String pathNew = FileSystems.getDefault()
                    .getPath("")
                    .toAbsolutePath()
                    .toString()
                    + "\\src\\main\\java\\HW15\\СonverteeedFiles\\";

            String name = file.getName();



            try (FileWriter fileNew = new FileWriter(((pathNew) + сutFileExtension(file) + ".yaml"), true)) {

                fileNew.write(outputYaml);

            } catch (IOException e) {
                e.printStackTrace();
            }

// from  YML to JSON
        } else if (getFileExtension(file).equals("yaml")) {

            String yml = ReadFromFile.readToString(path);
            Yaml yaml = new Yaml();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Object obj = yaml.load(yml);
            String obj1 = gson.toJson(obj);
            System.out.println(obj1);


// saving new files
            String pathNew = FileSystems.getDefault()
                    .getPath("")
                    .toAbsolutePath()
                    .toString()
                    + "\\src\\main\\java\\HW15\\СonverteeedFiles\\";

            try (FileWriter fileNew = new FileWriter(((pathNew) + сutFileExtension(file) + ".json"), true)) {

                fileNew.write(obj1);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
