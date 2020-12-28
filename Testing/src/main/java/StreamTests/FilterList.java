package StreamTests;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {

    public List filter (List<String> list){
        return  list.stream()
                .filter(e -> e.length() == 4 && e.equals(e.toLowerCase()))
                .collect(Collectors.toList());

    }
}


