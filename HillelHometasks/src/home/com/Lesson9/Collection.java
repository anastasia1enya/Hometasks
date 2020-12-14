package home.com.Lesson9;


import home.com.Lesson8.Collections;

import java.util.Arrays;

class Node<E> {
   public E item;
    public Node<E> next;
    public Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
public class Collection<E> implements CustomCollection <E> {


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //private  E str;
    private int count =0;

    Node<E>  first;
    Node<E> last;


   Collection (){

       first = new Node<E>(first,null,first);

       last= first;
    }

    @Override
    public boolean add(E str) {

        Node<E> nodeNew = new Node<E> (last,str,first);
        last.next = nodeNew;
        first.prev = nodeNew;
        last = nodeNew;

        count++;

        return true;
    }

    @Override
    public boolean addAll(E[] strArr) {
        for (int i = 0; i <strArr.length ; i++) {
            add(strArr[i]);
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<E> strColl) {

        for (int i = 0; i <strColl.size(); i++) {
            add(strColl.get(i));

        }
       return true;
    }

    @Override
    public boolean delete(int index) {
       Node current = first;
       Node previous = first;
       int i =0;
       while (i!= index){
           if (current.next== null){
               return false;
           } else {
               previous = current;
               current = current.next;
               i++;
           }

       }
       if (current== first)
           first = first.next;
       else
           previous.next= current.next;
        count--;
        return true;
    }

    @Override
    public boolean delete(E str) {

        Node current = first;
        Node previous = first;
        while (!current.item.equals(str)){
            if (current.next== null){
                return false;
            } else {
                previous = current;
                current = current.next;
            }

        }
        if (current== first)
            first = first.next;
        else
            previous.next= current.next;
        count--;
        return true;
    }

    @Override
    public E get(int index) {

        Node <E> current = first.next;
        for (int i = 0; i <count ; i++) {
            if (i == index){

                return current.item;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public boolean contains(E str) {
        Node <E> current = first.next;
        for (int i = 0; i <count ; i++) {

            if (str.equals(current.item)) {
                return true;

            }
            current = current.next;
        }
       return false;
    }

    @Override
    public boolean clear() {
       //удаляем ссылки 
       first.next.prev = null;
       last.next = null;

       first.next = first;
       first.prev = first;
       last= first;
       count =0;
       return true;
    }

    @Override
    public int size() {

       return count;
    }

    @Override
    public boolean trim() {

       return true;
    }

    @Override
    public boolean compare(Collection<E> coll) {
        Node <E> current = first.next;
        if (this==coll){return true;}
        if (count== (coll.size())){
            for (int i = 0; i < count; i++) {
                if (!coll.get(i).equals(current.item))

                    return false;

            }
            return true;

        }
        return false;
    }

    /*public String toString() {
        String res ="";
        for (int i = 0; i < count; i++) {
          //  res += item + " ";
        }
        return res;
    }*/

}
