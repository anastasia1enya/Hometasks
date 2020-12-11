package home.com.Lesson9;

public interface CustomCollection <E> {


        boolean add(E  str);

        boolean addAll(E [] strArr);

        boolean addAll(Collection<E> strColl);

        boolean delete (int index);

        boolean delete (E str);

        String get(int index);

        boolean contains(E  str);

        boolean clear();

        int size();

        boolean trim();

        boolean compare(Collection<E>  coll);


}
