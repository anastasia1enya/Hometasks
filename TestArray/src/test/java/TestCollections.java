

import org.junit.Assert;
import org.junit.Test;

public class TestCollections {

    @Test
    public boolean addO(){
        Assert.assertTrue(Collections.add(5));
        return addO();
    }
    @Test
    public void add (){Assert.assertTrue(Collections.add(0,4)); }
    @Test
    public void delete(){Assert.assertFalse(Collections.delete(5));}

    @Test
    public void get(){
        Assert.assertEquals(null,Collections.get(0));
    }

    @Test
    public void contain(){

        Object [] array = {5,4,3,8,9};
        Assert.assertFalse(Collections.contain(null));

    }


}
