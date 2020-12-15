package home.com.Lesson10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayIterator{

    public static void main(String[] args) {


        Iterrator iter = new Iterrator(5);

        while(iter.hasNext()){

            System.out.println(iter.next());
            System.out.println(iter.hasNext());
        }

    }
}

class Iterrator  implements Iterator {

        private Object[] array;
        private int count = 0;

        public Iterrator(int size) {
            array = new Object[size];
            System.out.println(Arrays.deepToString(array));

        }

        @Override
        public boolean hasNext() {
            return count < array.length;
        }

        @Override
        public Object next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return array[count++];
        }

}
