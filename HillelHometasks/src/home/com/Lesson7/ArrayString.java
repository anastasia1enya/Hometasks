package home.com.Lesson7;

import java.util.Arrays;

public class ArrayString  {

    public static void main(String[] args) {
        //создаем экземпляр класса


        Methods methods = new Methods();

        String [] array = new String[1];

        //array[0] = "kkkk";

        System.out.println("Original list:");
        System.out.println(Arrays.toString((methods.addIndex(array,0, "pppp"))));
        System.out.println(Arrays.toString((methods.addIndex(array,1, "Georgia"))));

        System.out.println(Arrays.toString((methods.addIndex( array,2, "Usa"))));

        System.out.println(Arrays.toString((methods.addIndex( array,3, "Odessa"))));
        System.out.println(Arrays.toString((methods.addIndex( array,4, "Odessa"))));
        System.out.println(Arrays.toString((methods.addIndex( array,5, "Odessa"))));
        System.out.println(Arrays.toString((methods.addIndex( array,6, "Odessa"))));
        System.out.println(Arrays.toString((methods.addIndex( array,7, "lolofofol"))));
        System.out.println(Arrays.toString((methods.addIndex( array,8, "Odessa"))));
        //System.out.println(Arrays.toString((methods.addIndex( array,8, "Odessa"))));
       // System.out.println(Arrays.toString((methods.addIndex( array,9, "Odessa"))));
        //System.out.println(Arrays.toString((methods.addIndex( array,10, "ppopop"))));
        //.out.println(Arrays.toString((methods.addIndex( array,11, "ppopop"))));


        /*System.out.println(Arrays.toString(methods.addIndex(0, "Georgia")));
        System.out.println(Arrays.toString(methods.addIndex(1, "USA")));
        System.out.println(Arrays.toString(methods.addIndex(2, "Canada")));
        System.out.println(Arrays.toString(methods.addIndex(3, "Odessa")));*/


    }

}




