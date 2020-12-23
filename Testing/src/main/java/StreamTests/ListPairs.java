package StreamTests;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
public class ListPairs {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");


        String a = new String(String.valueOf(collection));
        System.out.println(a.toUpperCase());

        //= Arrays.asList("one","two","three","four","five");

        collection.stream().map(String::toUpperCase).//peek((e) -> System.out.print(" " + e)).
                collect(Collectors.toList());
        collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);

    }

}
