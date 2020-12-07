package home.com.Lesson7;

import java.util.Arrays;


public class Methods {

    private String[] array;

    Methods() {
        array = new String[10];
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count = 0;

    // для распечатки массива
    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += array[i] + " ";
        }
        return res;
    }
// метод добавления по индексу

    public String[] addIndex(int index, String name) {
        this.name = name;

        if (index < 0) {
            return null;
        }

        if (count == array.length) {
            String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
            for (int i = array.length - 1; i > index; i--) {
                arrayNew[i + 1] = arrayNew[i];
            }
            array = arrayNew;
        }
        array[index] = name;
        count++;

        return array;
    }

    // метод добавления по значению

    public String[] addName(String name) {
        this.name = name;
        if (count == array.length) {
            String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
            for (int i = array.length - 1; i > count; i--) {
                arrayNew[i + 1] = arrayNew[i];
            }
            array = arrayNew;
        }
        array[count] = name;
        count++;

        return array;
    }

    // метод удаления по индексу

    public String[] deleteIndex(int index) {

        if (index < 0 || index > array.length) {
            return null;
        }

        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                i++;
            }
            arrayNew[j++] = array[i];
        }
        array = arrayNew;
        return array;
    }

    // метод удаления по значению
    public boolean deleteName(String name) {
        this.name = name;

        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length-1 );//добавляем новый массив с длинной -1
       int j = 0;
        boolean delete = false;
        for (int i = 0; i < array.length-1; i++) {

            if (array[i].equals(name)) {
                i++;
                delete = true;
            }
            arrayNew[j++] = array[i];
        }

        array = arrayNew;
        count--;
        return delete;


    }

    //метод получения  значения по индексу

    public String getIndex(int index) {

        String name = null;

        for (int i = 0; i < array.length; i++) {
            if (index < 0 || index >= array.length) {
                System.out.print("Wrong,");
                break;
            } else if (index == i) {
                name = array[i];
            }
        }
        return name;
    }


}



