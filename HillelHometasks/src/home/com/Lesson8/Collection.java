package home.com.Lesson8;


public interface Collection {

    boolean add(int index, Object o);

    boolean add (Object o);

    boolean delete (Object o);

    Object get(int index);

    boolean contain(Object o);

    boolean equals (Collection str);

    boolean clear();

    int size();
}


