package home.com.Lesson9;


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

    public E getStr() {
        return str;
    }

    public void setStr(E str) {
        this.str = str;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private  E str;
    private int count =0;

    public E item ;
    Node<E>  first;
    Node<E> last;
    Node<E> nodeStart;

   Collection (){
       //first=last;
       Node<E> nodeStart = new Node<E>(first,null,last);
       first.next = nodeStart;
       last.prev = nodeStart;
       count=0;
    }

    @Override
    public boolean add(E str) {

        Node<E> node1 = new Node<E> (first.next,str, last.prev);
       // first=nodeStart;
        last=node1;
        count++;

        return false;
    }

    @Override
    public boolean addAll(E[] strArr) {
        return false;
    }

    @Override
    public boolean addAll(Collection<E> strColl) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(E str) {
        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean contains(E str) {
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
    public boolean compare(Collection<E> coll) {
        return false;
    }

    public String toString() {
        String res ="";
        for (int i = 0; i < count; i++) {
            res += item + " ";
        }
        return res;
    }

}
