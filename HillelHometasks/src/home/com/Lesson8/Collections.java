package home.com.Lesson8;

import java.util.*;

public class Collections implements Collection {

    private int count = 0;
    private Object[] array;


    Collections() {
        array = new Object[10];
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += array[i] + " ";
        }
        return res;
    }


    // метод добавления по значению
    @Override
    public boolean add(Object o) {

        if (count == array.length) {
            Object[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
            for (int i = array.length - 1; i > count; i--) {
                arrayNew[i + 1] = arrayNew[i];
            }
            array = arrayNew;
        }
        array[count] = o;
        count++;

        return true;
    }

    // метод добавления по индексу
    @Override
    public boolean add(int index, Object o) {

        if (index < 0 || index > array.length + 2) {
            return false;
        }

        if (count == array.length) {
            Object[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
            for (int i = array.length - 1; i > index; i--) {
                arrayNew[i + 1] = arrayNew[i];
            }
            array = arrayNew;
        }
        array[index] = o;
        count++;

        return true;
    }

    // метод удаления по значению
    @Override
    public boolean delete(Object o) {

        if (o == null) {
            return false;
        }
        boolean delete = false;
        Object[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1
        int j = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(o)) {
                i++;
                delete = true;
            }
            arrayNew[j++] = array[i];
        }
        count--;
        array = arrayNew;
        return delete;

    }

    //метод получения  значения по индексу
    @Override
    public Object get(int index) {

        Object o = null;

        for (int i = 0; i < array.length; i++) {
            if (index < 0 || index > array.length) {
                System.out.print("Wrong,");
                break;
            } else if (index == i) {
                o = array[i];
            }
        }
        return o;

    }

    // метод проверки наличия єлемента в коллекции
    @Override
    public boolean contain(Object o) {

        for (int i = 0; i < count; i++) {

            if (o == array[i]) {
                return true;
            }

        }
        return false;
    }


//

    @Override
    public boolean equals(Collections str) {

        if (this == str) {
            return true;
        }
        if (count == ((Collections) str).size()) {
            for (int i = 0; i < count; i++) {
                if (array[i] != (str.get(i))) return false;
            }
            return true;
        }

        return false;
    }


    // метод удаления значений из коллекции
    @Override
    public boolean clear() {
        array = new Object[10];
        count = 0;

        return true;
    }

    // метод получения размера коллекции
    @Override
    public int size() {

        return count;
    }

}
