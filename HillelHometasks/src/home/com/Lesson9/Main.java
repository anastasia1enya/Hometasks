package home.com.Lesson9;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       LinkedList<String> a = new LinkedList<>();
       /*a.add("Boo");
       a.add("Doo");
        a.add("Joo");
        System.out.println(a.remove("Boo"));*/
        Collection<String> c = new Collection<>();
        Collection<String> d = new Collection<>();

        c.add("John");
        c.add("NHN");
        c.add("BBB");
        d.add("John");
        d.add("NHN");
        d.add("BBB");
        //System.out.println(c.delete(1));
       // System.out.println(c.get(0));
        //System.out.println(c.contains("John"));
        //System.out.println(c.contains("NHN"));
        //System.out.println(c.contains("BBB"));
        //System.out.println(c.contains("BBBB"));
        //System.out.println(c.contains("MHH"));
        System.out.println(c.compare(d));


       /* System.out.println(c.first.item);
        System.out.println(c.last.item);
        System.out.println(c.last.next.next.next.prev.next.item);

        c.clear();

        System.out.println(c.first.item);
        System.out.println(c.last.item);
        System.out.println(c.last.next.next.next.prev.next.item);


        System.out.println(c.toString());*/


    }
}
