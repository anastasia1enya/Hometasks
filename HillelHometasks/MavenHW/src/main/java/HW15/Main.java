package HW15;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;

public class Main {

    public static void main(String[] args) throws IOException {

        Converter converter = new Converter();

        String textDirectory1 = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\Files\\20_item.json";
        String textDirectory2 = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\Files\\100_item.json";
        String textDirectory3 = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\Files\\test1.yaml";
        String textDirectory4 = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\Files\\test2.yaml";


        File file1 = new File(textDirectory1);
//        System.out.println("Расширение файла: " + converter.getFileExtension(file1));
        File file2 = new File(textDirectory2);
//        System.out.println("Расширение файла: " +converter.getFileExtension(file2));
        File file3 = new File(textDirectory3);
//        System.out.println("Расширение файла: " + converter.getFileExtension(file3));
        File file4 = new File(textDirectory4);
//        System.out.println("Расширение файла: " +converter.getFileExtension(file4));

        converter.type(file1, textDirectory1);
        converter.type(file2, textDirectory2);
        converter.type(file3, textDirectory3);
        converter.type(file4, textDirectory4);

    }
}


