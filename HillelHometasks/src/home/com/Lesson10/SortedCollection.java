package home.com.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;


public class SortedCollection {


    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<>();
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

        s.sorted(a);

    }


}

class Sort {

    ArrayList<String> s = new ArrayList<>();
    int count;

    public void sorted( ArrayList<String> str){
        //str.stream().sorted();

        for (int i = 0; i < str.size() ; i++) {
            System.out.println("i" + i);
            for (int j = 0; j <str.size() ; j++) {
                System.out.println("j" + j);
                if (str.get(i).equals(str.get(j))){

                    continue;
                }

            }
            s.add(str.get(i));
        }

        System.out.println(s.toString());
    }

}