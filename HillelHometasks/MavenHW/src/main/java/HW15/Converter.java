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
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") +1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
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

            String pathNew = FileSystems.getDefault()
                    .getPath("")
                    .toAbsolutePath()
                    .toString()
                    +"\\src\\main\\java\\HW15\\Converteeed.Files\\";

            try {
                FileWriter fileNew = new FileWriter(pathNew+"Converted"+file.getName() , true);
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
            String obj1 =gson.toJson(obj);
            System.out.println(obj1);

            String pathNew = FileSystems.getDefault()
                    .getPath("")
                    .toAbsolutePath()
                    .toString()
                    +"\\src\\main\\java\\HW16\\Converteeed.Files";

            try {
                FileWriter fileNew = new FileWriter(pathNew+getFileExtension(file)+"Converted" +".yml", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
