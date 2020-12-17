import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class TestArray {

    @Test

    public void addTest(){

        Assert.assertTrue(Array.add(3));
        Assert.assertTrue(Array.add(1,4));
        Assert.assertTrue(Array.delete(3));
        Assert.assertEquals(4,Array.get(0));
        Assert.assertTrue(Array.contain(4));
        Assert.assertEquals(1,Array.size());
        Array arr2= new Array();
        Assert.assertEquals(true,Array.equals(arr2));
        Assert.assertTrue(Array.clear());
        Assert.assertEquals(0,Array.size());
    }


   /* @Test
    public void addIndexTest(){

        Assert.assertTrue(Array.add(1,4));
    }

    @Test

    public void deleteTest(){

        Assert.assertTrue(Array.delete(3));


    }

    @Test

    public void getTest(){

        Assert.assertEquals(3,Array.get(0));

    }

   @Test

    public void containTest(){

        Assert.assertTrue(Array.contain(4));


    }
    @Test

    public void sizeTest(){

        Assert.assertEquals(1,Array.size());


    }



  /* @Test

    public void equalsTest(){

        Array arr2= new Array();
        Assert.assertEquals(true,Array.equals(arr2));


    }
    @Test
    public void clear(){
        Assert.assertTrue(Array.clear());
    }*/

    /*@Mock
    Array data = new Array();
    data.add("John");
Mockito.when(dataService).getData;*/

}




