package HW15;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) throws IOException {

        Converter converter = new Converter();

        File workDir = new File(FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString());
        String textDirectory = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\Files";

        String s = "C:\\Users\\admin\\Desktop\\Java 2\\Hometasks\\HillelHometasks\\MavenHW\\src\\main\\java\\HW15\\Files";
        for (File f :workDir.listFiles()){
if (f.isFile()){
    converter.type(f,f.getPath());
} converter.type(f,s);
        }


//        String textDirectory1 = FileSystems.getDefault()
//                .getPath("")
//                .toAbsolutePath()
//                .toString()
//                + "\\src\\main\\java\\HW15\\Files\\20_item.json";
//        String textDirectory2 = FileSystems.getDefault()
//                .getPath("")
//                .toAbsolutePath()
//                .toString()
//                + "\\src\\main\\java\\HW15\\Files\\100_item.json";
//        String textDirectory3 = FileSystems.getDefault()
//                .getPath("")
//                .toAbsolutePath()
//                .toString()
//                + "\\src\\main\\java\\HW15\\Files\\test1.yaml";
//        String textDirectory4 = FileSystems.getDefault()
//                .getPath("")
//                .toAbsolutePath()
//                .toString()
//                + "\\src\\main\\java\\HW15\\Files\\test2.yaml";
//
//
//        File file1 = new File(textDirectory1);
////        System.out.println("Расширение файла: " + converter.getFileExtension(file1));
//        File file2 = new File(textDirectory2);
////        System.out.println("Расширение файла: " +converter.getFileExtension(file2));
//        File file3 = new File(textDirectory3);
////        System.out.println("Расширение файла: " + converter.getFileExtension(file3));
//        File file4 = new File(textDirectory4);
////        System.out.println("Расширение файла: " +converter.getFileExtension(file4));
//
//        converter.type(file1, textDirectory1);
//        converter.getFileStructure(file2, textDirectory2);
//        converter.getFileStructure(file3, textDirectory3);
//        converter.getFileStructure(file4, textDirectory4);

    }
}


