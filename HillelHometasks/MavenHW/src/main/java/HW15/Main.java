package HW15;

import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        File file = new File("\\src\\main\\java\\HW15\\Files\\20_item.json");
        System.out.println("Расширение файла: " + getFileExtension(file));

        //проверяем метод на файле без расширения
      /*  file = new File("\\src\\main\\java\\HW15\\100_item.json");
        System.out.println("Расширение файла: " + getFileExtension(file));

        //проверяем метод на файле с точкой в имени
        file = new File("\\src\\main\\java\\HW15\\test1.yaml");
        System.out.println("Расширение файла: " + getFileExtension(file));

        //проверяем метод на файле без расширения
        file = new File("\\src\\main\\java\\HW15\\test2.yaml");
        System.out.println("Расширение файла: " + getFileExtension(file));*/

type(file);

    }

    //метод определения расширения файла
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") +1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }

    public static void type(File file) {

       // File f = new File("\\src\\main\\java\\HW15\\test2.yaml");
if (getFileExtension(file).equals("json")){
    String json = ReadFromFile.readToString("C:\\Users\\Yuliia\\Desktop\\Hometasks\\HillelHometasks\\MavenHW\\src\\main\\java\\HW15\\Files\\20_item.json");

    Gson gson = new Gson();
    Map map = gson.fromJson(json, Map.class);

    System.out.println(map);

    Set<String> set = map.keySet();

    for (String str : set) {
        System.out.println("-----------------------");
        System.out.print(str + " ... ");
        System.out.println(map.get(str));
        System.out.println(map.get(str).getClass());

    }
    Yaml yaml = new Yaml();
  //  String yamlStr = ReadFromFile.readToString("C:\\Users\\Yuliia\\Desktop\\Hometasks\\HillelHometasks\\MavenHW\\src\\main\\java\\HW15\\Files\\20_item.json");
    Map<String, Object> obj = yaml.load((InputStream) map);
    System.out.println(obj);
    System.out.println(yaml.dump(obj));
}else{
    System.out.println("6yaml");
}

    }
}
