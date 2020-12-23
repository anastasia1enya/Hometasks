package StreamTests;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterdList {
    public static void main(String[] args) {

        FilterList filter = new FilterList();

        List<String> list =Arrays.asList("one","two","FOUR","five","ELEVEN","nine","TEN");

        System.out.println(filter.filter(list));
    }
}

class FilterList{

    public List filter (List<String> list){
        return  list.stream()
                .filter(e -> e.length() == 4 && e.equals(e.toLowerCase()))
                .collect(Collectors.toList());


    }

}
