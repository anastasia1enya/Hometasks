package HW12;

import HW12.Average;
import HW12.FilterList;
import HW12.ListPairs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Testing {

    Average average;
    Collection<Integer> coll;

    FilterList filter;
    List<String> list;

    ListPairs pair;
    List<String> coll2;

    @Before
    public void init (){
        average = new Average();

        coll= Arrays.asList(8,70,5,65);

        filter = new FilterList();

        list = new ArrayList<>();
        list.add("spring");
        list.add("AUTUMN");
        list.add("summer");
        list.add("WINTER");
        list.add("ELEVEN");
        list.add("nine");
        list.add("NOVEMBER");

        pair = new ListPairs();

        coll2 = new ArrayList<>();
        coll2.add("hello");
        coll2.add("world");
        coll2.add("java");


    }


//тест среднеарифмет.число
    @Test
    public void averageTest(){

        long sum = coll.stream().mapToLong((s) -> s).sum();
        double res = (double)sum/coll.size();

        Assert.assertEquals(java.util.Optional.of(res),java.util.Optional.of(average.calc(coll)));
    }
    //тесты фильтров
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
//тест парной коллекции
    @Test
    public void pairTest() {

        List<Pair> pairedColl = new ArrayList<>();
        for (String s : coll2) {

            pairedColl.add(new Pair(s, s.toUpperCase()));

        }

            Assert.assertEquals(pairedColl, pair.pair(coll2));

    }

}
