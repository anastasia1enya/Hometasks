package StreamTests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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
        Collection<String> collection2 = collection.stream().map(String::toUpperCase).collect(Collectors.toList());

        Pair pair = new Pair(collection,collection2);
        System.out.println(pair.toString());

        collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);

    }

}

final class Pair<T, U> {

    public Pair(T first, U second) {
        this.second = second;
        this.first = first;
    }

    public final T first;
    public final U second;

    // Because 'pair()' is shorter than 'new Pair<>()'.
    // Sometimes this difference might be very significant (especially in a
    // 80-ish characters boundary). Sorry diamond operator.
    public static <T, U> Pair<T, U> pair(T first, U second) {
        return new Pair<>(first, second);
    }

    @Override
    public String toString() {


        return  "(" + first + ", " + second + ")";
    }
}
