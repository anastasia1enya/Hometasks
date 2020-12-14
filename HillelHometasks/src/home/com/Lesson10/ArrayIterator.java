package home.com.Lesson10;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayIterator{

    public static void main(String[] args) {

        Object [] array = {5,7,8,9,45,8,5,5};

        Iterrator iter = new Iterrator(array);
        System.out.println(iter.hasNext());

        while(iter.hasNext()){

            System.out.println(iter.next());
            System.out.println(iter.hasNext());
        }

    }
}

class Iterrator <E> implements Iterator<E> {


        private E[] array;
        private int index = 0;

        public Iterrator(E[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return array[index++];
        }

}
