package HW12;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class ListPairs {


    public List pair(List<String> collection) {
        /*Object coll = collection.stream().map(e -> new Pair(e, e.toUpperCase()))
                .collect(Collectors.toList());*/

        return collection.stream().map(e -> new Pair(e, e.toUpperCase()))
                .collect(Collectors.toList());

    }
}
class Pair {

    private final String first;
    private final String second;
    private List<String> array;

    Pair(String first, String second) {

        this.second = second;
        this.first = first;

    }

    public List<String> toPair() {
        array.add(first);
        array.add(second);
        return array;
    }

    @Override
    public String toString() {

        return "(" + first + ", " + second + ")";
    }
}