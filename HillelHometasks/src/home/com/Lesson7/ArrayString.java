package home.com.Lesson7;

import java.util.Arrays;

public class ArrayString extends Methods {

    public static void main(String[] args) {
        //создаем массив

        System.out.println("Original list:");

        String countries [] = {"USA","Canada","Paris","Bulgari","Odessa", "Portugal", "Spain", "Germany"};

        System.out.println(Arrays.toString(countries));
      // создаем экземпляр класса
     Methods methods = new Methods();

        System.out.println("Modified one:");
        System.out.println("___________________");
     //добавляем/удаляем элементы
     String [] countries1 = methods.deleteIndex(countries,2);
     String [] countries2 = methods.deleteName(countries1,"Odessa");
     String [] countries3 = methods.addIndex(countries2, 2,"France");
     String [] countries4 = methods.addName(countries3 ,"Georgia");
     String [] countries5 = methods.addName(countries4 ,"Brazil");
     String [] countries6 = methods.addName(countries5 ,"Ecuador");
     methods.getIndex(countries6,"Georgia");














    }

}


