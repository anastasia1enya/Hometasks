package StreamTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Collection<Integer> collection = Arrays.asList(5,4,3,2,10);
        Average c = new Average();

        System.out.println(c.calc(collection));

        StreamTests.FilterList filter = new StreamTests.FilterList();

        List<String> arrray = new ArrayList<>();
        arrray.add("spring");
        arrray.add("AUTUMN");
        arrray.add("summer");
        arrray.add("WINTER");
        arrray.add("ELEVEN");
        arrray.add("nine");
        arrray.add("NOVEMBER");

        System.out.println(filter.filter(arrray));

            Collection<String> collection1 = new ArrayList<>();
            collection1.add("one");
            collection1.add("two");
            collection1.add("three");
            collection1.add("four");
            collection1.add("five");

            main.java.StreamTests.ListPairs pairs = new main.java.StreamTests.ListPairs();

        System.out.println(pairs.pair(collection1));




    }
}
