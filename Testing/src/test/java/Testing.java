import StreamTests.Average;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class Testing {

    Collection<Integer> coll;


    Average average = new Average();

    @Test
    public void averageTest(){

        coll= Arrays.asList(8,70,5,65);
        long sum = coll.stream().mapToLong((s) -> s).sum();
        double res = (double)sum/coll.size();

        Assert.assertEquals(java.util.Optional.of(res),java.util.Optional.of (Average.calc(coll)));
    }

}
