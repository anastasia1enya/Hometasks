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

        File textDirectory =new File( FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\Files");

        if (args.length!=0){
            workDir = new File(args[0]);
        } else {
            workDir = new File (String.valueOf(textDirectory));
        }

//        System.out.println(workDir);
//        System.out.println(textDirectory);
//        System.out.println("----------");
int i = 0;

        String a = textDirectory + "\\src\\main\\java\\HW15\\Files";

            for (File f : workDir.listFiles()) {

                    if (f.isFile()) {

                    System.out.println("-----" + i++);
                    converter.type(f, f.getAbsolutePath());
                    System.out.println(f.getAbsolutePath());
                } else {
//
                    converter.type(f, a);
                    System.out.println("////////" + i++);
                    System.out.println(f.getPath());
                    System.out.println(a);
                }
            }


    }
}


