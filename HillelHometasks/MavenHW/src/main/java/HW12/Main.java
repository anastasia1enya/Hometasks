package HW12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Collection<Integer> collection = Arrays.asList(5,4,3,2,10);
        Average c = new Average();

        System.out.println(c.calc(collection));

        FilterList filter = new FilterList();

        List<String> arrray = new ArrayList<>();
        arrray.add("spring");
        arrray.add("AUTUMN");
        arrray.add("summer");
        arrray.add("WINTER");
        arrray.add("ELEVEN");
        arrray.add("nine");
        arrray.add("NOVEMBER");

        System.out.println(filter.filter(arrray));

        List<String> collection1 = new ArrayList<>();
        collection1.add("one");
        collection1.add("two");
        collection1.add("three");
        collection1.add("four");
        collection1.add("five");

        ListPairs pairs = new ListPairs();

        System.out.println(pairs.pair(collection1));

///////////////////////////////////////////////////

        List<String> coll2;
        coll2 = new ArrayList<>();
        coll2.add("hello");
        coll2.add("world");
        coll2.add("java");


        List<String> pairedColl = new ArrayList<>();


        for (String s : coll2) {

            pairedColl.add("(" + s + ", " + s.toUpperCase() + ")");

        }

        List collUpper = pairs.pair(coll2);

        for (int i = 0; i <coll2.size() ; i++) {

            System.out.println(coll2.get(i)==collUpper.get(i));

        }


        System.out.println(collUpper);
        System.out.println(pairedColl);
        System.out.println(collUpper.getClass());
        System.out.println(pairedColl.getClass());

        System.out.println(collUpper.size());
        System.out.println(pairedColl.size());

        System.out.println(collUpper.hashCode());

        System.out.println(pairedColl.hashCode());

        System.out.println(collUpper.equals(pairedColl));

    }
}
