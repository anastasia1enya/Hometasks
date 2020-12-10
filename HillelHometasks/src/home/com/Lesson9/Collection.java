package home.com.Lesson9;

import java.util.Arrays;


class Node {

    private String next;
    private String prev;
    private String element;

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

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    private String[] nodeArray;

    public String[] getNodeArray() {
        return nodeArray;
    }

    public void setNodeArray(String[] nodeArray) {
        this.nodeArray = nodeArray;
    }

    Node() {

        String[] nodeArray = {prev, element, next};

    }

    public String[] info(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                prev = null;
            } else {
                prev = array[i - 1];
            }
            if (i == array.length - 1) {
                next = null;
            } else {
                next = array[i + 1];
            }

            element = array[i];
        }
        return nodeArray;
    }
}

public class Collection  implements CustomCollection {


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



    Collection (){
        array = new String[1];
        //nodeArray = new String[2];


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
        count++;
        Node node = new Node ();

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
