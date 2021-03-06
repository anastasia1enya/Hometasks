package HW12;

import java.util.List;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second) &&
                Objects.equals(array, pair.array);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, array);
    }

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

   /* @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result;
        result = PRIME * result + ((first == null) ? 0 : first.hashCode());
        result = PRIME * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {

        if(obj == null)
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        Pair e = (Pair) obj;
        return (this.toString().equals(e.toString()));
        // return super.equals(obj);
    }*/
}