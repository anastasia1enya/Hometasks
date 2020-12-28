import StreamTests.Average;
import StreamTests.FilterList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Testing {

    Collection<Integer> coll;
    Average average;
    FilterList filter;
    List<String> list;

    @Before
    public void init (){
        average = new Average();
        coll= Arrays.asList(8,70,5,65);
        filter = new FilterList();
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
        List list2 = filter.filter(list);

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals(list.get(i).toUpperCase())){
                list.remove(i);

            }

        }


        //Assert.assertFalse(list2.contains());

    }
}
