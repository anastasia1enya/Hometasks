package home.com.Lesson7;

import home.com.Lesson8.Collection;
import home.com.Lesson8.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayString  {


    public static void main(String[] args) {
        //создаем экземпляр класса

        Methods countries = new Methods();

        // взаимодействуем с коллекцией
        countries.addIndex(0,"USA");
        countries.addIndex(1,"Odessa");
        countries.addIndex(2,"Canada");
        countries.addIndex(3,"Houston");
        countries.addIndex(4,"Tokyo");
        countries.addIndex(5,"Japan");
        countries.addIndex(6,"China");
        countries.addIndex(7,"Argentina");
        System.out.println(countries.toString());
        countries.addName("Brazil");
        countries.addName("France");
        countries.addName("Paris");
        countries.addName("Spain");
        countries.addName("Ukraine");
        countries.addName("Hong Kong");
        countries.addName("Texas");
        countries.addName("Australia");
        System.out.println(countries.toString());
        System.out.println(countries.getIndex(5));
        countries.deleteIndex(1);
        countries.deleteName("Paris");
        countries.deleteName("Texas");
        countries.deleteName("Houston");
        countries.deleteName("Tokyo");
        System.out.println(countries.toString());
        System.out.println(countries.getIndex(8));
        System.out.println(countries.getIndex(0));
        System.out.println(countries.getIndex(28));

    }

}




