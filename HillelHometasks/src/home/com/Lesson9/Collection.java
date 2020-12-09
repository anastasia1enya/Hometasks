package home.com.Lesson9;

import java.util.Arrays;


class Node {
    private String [] next ;
    private String [] prev ;

    public String [] getNext() {
        return  next;
    }

    public void setNext(String []next) {
        this.next = next;
    }

    public String [] getPrev() {
        return prev;
    }

    public void setPrev(String []prev) {
        this.prev = prev;
    }

    Node(String [] prev,String str, String [] next){


    }

    public String [] next (String [] array) {

        this.next = next;

        for (int i = 0; i < array.length; i++) {

            if (i == array.length-1 ) {
                next [i] = null;
            } else {
                next [i] = array[i + 1];
            }

        }
        return next;
    }

    public String [] prev (String [] array) {

        this.prev = prev;

        for (int i = array.length-1; i >=1 ; i--) {

            if (i == 1) {
                prev [i] = null;
            } else {
                prev [i]= array[i - 1];
            }

        }
        return prev;
    }

}


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



    private String [] array;
    private String str;
    private int count;

    private String [] next1;
    private String [] prev1;

    public String []getNext1() {
        return next1;
    }

    public void setNext1(String [] next1) {
        this.next1 = next1;
    }

    public String [] getPrev1() {
        return prev1;
    }

    public void setPrev1(String []prev1) {
        this.prev1 = prev1;
    }




    Collection (){
        array = new String[1];
       Node node = new Node(prev1,str,next1);
       // this.str = str;
        next1=  node.next(array);
        prev1 = node.prev(array);

    }
    public String toString() {
        String res ="";
        for (int i = 0; i < array.length; i++) {
            res += array[i] + " ";
        }
        return res;
    }



    @Override
    public boolean add(String str) {

        if (count == array.length) {
            String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
            for (int i = array.length - 1; i > count; i--) {
                arrayNew[i + 1] = arrayNew[i];
            }
            array = arrayNew;

        }
        array[count]=str;
        System.out.println(next1[count]);
        System.out.println(prev1[count]);

        count++;

        return true;

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
