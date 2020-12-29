import StreamTests.Average;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Testing {

    Collection<Integer> coll;
    Average average;
    StreamTests.FilterList filter;
    List<String> list;

    @Before
    public void init (){
        average = new Average();
        coll= Arrays.asList(8,70,5,65);
        filter = new StreamTests.FilterList();
        list = new ArrayList<>();

        list.add("spring");
        list.add("AUTUMN");
        list.add("summer");
        list.add("WINTER");
        list.add("ELEVEN");
        list.add("nine");
        list.add("NOVEMBER");

    }



    @Test
    public void averageTest(){

        long sum = coll.stream().mapToLong((s) -> s).sum();
        double res = (double)sum/coll.size();

        Assert.assertEquals(java.util.Optional.of(res),java.util.Optional.of(average.calc(coll)));
    }

    @Test
    public void filterTest1(){
        List<String> list2 = filter.filter(list);

        for (int i = 0; i <list.size() ; i++) {

            if (list.get(i).equals(list.get(i).toUpperCase()) || list.get(i).length() != 4) {
                list.remove(i);
                i--;
            }

        }

       Assert.assertEquals(list.size(),list2.size());


    }

    @Test
    public void filterTest2(){
        List<String> list2 = filter.filter(list);

        for (int i = 0; i <list2.size() ; i++) {

            Assert.assertFalse(list2.contains(list2.get(i)==list2.get(i).toUpperCase()));
            Assert.assertFalse(list2.contains(list.get(i).length() != 4));

        }

    }

}
