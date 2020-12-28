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

        FilterList filter = new FilterList();

        List<String> list =Arrays.asList("one","two","FOUR","five","ELEVEN","nine","TEN");

        System.out.println(filter.filter(list));

            Collection<String> collection1 = new ArrayList<>();
            collection1.add("one");
            collection1.add("two");
            collection1.add("three");
            collection1.add("four");
            collection1.add("five");

            ListPairs pairs = new ListPairs();

        System.out.println(pairs.pair(collection1));


    }
}
