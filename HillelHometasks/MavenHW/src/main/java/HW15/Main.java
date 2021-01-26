package HW15;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args  ) throws IOException {

        Converter converter = new Converter();
//для смд
        File workDir = new File(FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString());
//для идеии
        File textDirectory =new File( FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()
                + "\\src\\main\\java\\HW15\\Files");
        System.out.println(workDir);
        if (args.length!=0){
            workDir = new File(args[0]);
        }   else {
            workDir = new File (workDir.getAbsolutePath());
        }

        int i = 1;


            for (File f : workDir.listFiles()) {

                    if (f.isFile()) {
                        System.out.println("---File " + i++ + " "+ f.getName()+ " ---converted" );
                        converter.type(f, f.getAbsolutePath());

                } else {
                        System.out.println("Not a file");
                }
            }


    }
}


