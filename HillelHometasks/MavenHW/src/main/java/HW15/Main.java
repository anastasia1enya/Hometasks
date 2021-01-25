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
        System.out.println(workDir);
        if (args.length!=0){
            workDir = new File(args[0]);
        } else {
            workDir = new File (String.valueOf(workDir));
        }

        System.out.println(workDir);
//        System.out.println(textDirectory);
//        System.out.println("----------");
int i = 0;

        String a = textDirectory + "\\src\\main\\java\\HW15\\Files\\";

            for (File f : workDir.listFiles()) {

                    if (f.isFile()) {

                    System.out.println("-----" + i++);
                    converter.type(f, String.valueOf(workDir));
                    System.out.println(f.getAbsolutePath());
                } else {
//
                        System.out.println("Not a file");
                }
            }


    }
}


