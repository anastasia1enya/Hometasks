package home.com.Lesson9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("John");
        list.iterator();

        Collection c = new Collection();
        System.out.println(Arrays.toString(c.add2("John")));


    }
}
