package HW12;

import java.util.Arrays;
import java.util.Collection;

public class Average {


    public  Double calc(Collection<Integer> collection){
        Double obj = collection.stream().mapToInt((s) -> s).average().getAsDouble();
        return obj;

    }

}

