package home.com.Lesson10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class SortedCollection {


    public static void main(String[] args) {

        Collection <String> a = new ArrayList<>();
        a.add("A");//0
        a.add("B");//1
        a.add("C");//2
        a.add("D");//3
        a.add("E");//4
        a.add("F");//5
        a.add("G");//6
        a.add("H");//7
        a.add("A");//8
        a.add("B");//9
        a.add("C");//10
        a.add("K");//11
        a.add("L");//12
        a.add("M");//13
        a.add("N");//14

        System.out.println(a.toString());

        Sort s = new Sort();
        s.deleteDyplicate(a);

        System.out.println(s.toString());

    }

}

class Sort {

    public  <T> Collection<T> deleteDyplicate(Collection<T> collection) {
        return new HashSet<>(collection);
    }

}