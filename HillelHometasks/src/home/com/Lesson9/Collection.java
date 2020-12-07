package home.com.Lesson9;

import java.util.Arrays;
import java.util.LinkedList;

public class Collection implements CustomCollection {




    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    private String [] array;
    private String str;
    private int count;
    private String next ;
    private String prev ;


    Collection (){
        array = new String[10];
        next = null;
        prev = null;

    }

public String next (String [] array,String next) {
    this.array = array;
    this.next = next;

    for (int i = 0; i < array.length; i++) {

        if (i == array.length - 1) {
            next = null;
        } else {
            next = array[i + 1];
        }

    }
    return next;
}

    public String prev (String [] array,String prev) {
        this.array = array;
        this.prev = prev;

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                prev = null;
            } else {
                prev = array[i - 1];
            }

        }
        return prev;
    }

    @Override
    public boolean add(String str) {

        if (count == array.length) {
            String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
            for (int i = array.length - 1; i > count; i--) {
                arrayNew[i + 1] = arrayNew[i];
                System.out.println(next(arrayNew,next));
                System.out.println(prev(arrayNew,prev));
            }
            array = arrayNew;
            System.out.println(next(arrayNew,next));
            System.out.println(prev(arrayNew,prev));
        }
        array[count]=str;
        count++;

        return true;

    }

    public String [] add2 (String str) {

        if (count == array.length) {
            String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
            for (int i = array.length - 1; i > count; i--) {
                arrayNew[i + 1] = arrayNew[i];
                System.out.println(next(arrayNew,next));
                System.out.println(prev(arrayNew,prev));
            }
            array = arrayNew;
            System.out.println(next(arrayNew,next));
            System.out.println(prev(arrayNew,prev));
        }
        array[count]=str;
        count++;

        return array;

    }

    @Override
    public boolean addAll(String[] strArr) {
        return false;
    }

    @Override
    public boolean addAll(Collection strColl) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compare(Collection coll) {
        return false;
    }
}
