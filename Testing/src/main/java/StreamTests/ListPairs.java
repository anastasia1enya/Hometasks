package  main.java.StreamTests;

import java.util.Collection;
import java.util.stream.Collectors;
public class ListPairs {


    public  Collection pair(Collection<String> collection){
        /*Object coll = collection.stream().map(e -> new Pair(e, e.toUpperCase()))
                .collect(Collectors.toList());*/

        Collection <Pair> coll2 = collection.stream().map(e -> new Pair(e, e.toUpperCase()))
                .collect(Collectors.toList());
        return coll2;

    }


}

final class Pair<T, U> {

    public Pair(T first, U second) {
        this.second = second;
        this.first = first;
    }

    public final T first;
    public final U second;

    @Override
    public String toString() {


        return  "(" + first + ", " + second + ")";
    }
}
