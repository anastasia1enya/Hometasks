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
        c.add("John");
        c.add("Tom");
        c.add("I");
        System.out.println(c.toString());
        System.out.println(Arrays.toString(c.getNodeArray()));


    }
}
