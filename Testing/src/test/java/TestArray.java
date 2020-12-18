
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestArray {

        Array  array ;

        @Before
        public void init (){
            array = new Array();
            array.add(5);
            array.add(4);
            array.add(3);
        }


        @Test

        public void addTest(){

            Assert.assertTrue(array.add(5));
            Assert.assertEquals(4,array.size());

        }


        @Test
        public void addIndexTest(){

            Assert.assertTrue(array.add(1,4));
            Assert.assertEquals(4,array.size());
        }

        @Test

        public void deleteTest(){

            Assert.assertTrue(array.delete(5));
            Assert.assertEquals(2,array.size());

        }

        @Test

        public void getTest(){

            Assert.assertEquals(5,array.get(0));

        }

        @Test

        public void containTest(){

            Assert.assertTrue(array.contain(4));
            Assert.assertFalse(array.contain(50));


        }
        @Test

        public void sizeTest(){

            Assert.assertEquals(3,array.size());


        }

        @Test

        public void equalsTest(){

            Array arr2= new Array();
            arr2.add(5);
            arr2.add(4);
            arr2.add(3);
            Assert.assertTrue(array.equals(arr2));
            arr2.add(10);
            Assert.assertFalse(array.equals(arr2));
        }
        @Test
        public void clear(){
            Assert.assertTrue(array.clear());
            Assert.assertEquals(0,array.size());


    }


}




