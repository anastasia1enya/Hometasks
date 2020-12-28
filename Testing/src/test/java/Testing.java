import StreamTests.Average;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        list = List.of("aaa","bbbbb","AAAAAAA","ccccc","DDDDDDDDD");

    }



    @Test
    public void averageTest(){

        long sum = coll.stream().mapToLong((s) -> s).sum();
        double res = (double)sum/coll.size();

        Assert.assertEquals(java.util.Optional.of(res),java.util.Optional.of(average.calc(coll)));
    }

    @Test
    public void filterTest(){
        List<String> list2 = filter.filter(list);

        int count =0;

        for (int i = 0; i <list.size() ; i++) {

            if (list.get(i) == list.get(i).toUpperCase()){
                count++;
                System.out.println(count);
            }



        }
//Assert.assertTrue(list2.contains(list2.get(i).toUpperCase()));
       // Assert.assertEquals(list2.size(),count);

    }
}
