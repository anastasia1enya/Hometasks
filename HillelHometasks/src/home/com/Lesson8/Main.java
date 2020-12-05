package home.com.Lesson8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Collections coll = new Collections();

        coll.add(5);
        coll.add(6);
        coll.add(7);
        coll.add(8);
        coll.add(9);
        coll.add(10);

        System.out.println(coll.contain(8));
        System.out.println(coll.size());
        System.out.println(coll.toString());
        coll.clear();
        System.out.println(coll.size());

        System.out.println(coll.toString());

    }
}
