package StreamTests;

import java.util.Arrays;
import java.util.Collection;

public class Average {

    public static void main(String[] args) {


        Collection<Integer> collection = Arrays.asList(5,4,3,2,10);
        System.out.println(calc(collection));


    }

    public static Double calc(Collection<Integer> collection){
        Double obj = collection.stream().mapToInt((s) -> s).average().getAsDouble();
        return obj;

    }
}

