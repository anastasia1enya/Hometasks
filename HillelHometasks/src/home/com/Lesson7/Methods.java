package home.com.Lesson7;

import java.util.Arrays;


public class Methods {

    private String[] array;

    Methods() {
        array = new String[1];
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }


    private int count = 0;
// для распечатки массива
    public String toString() {
        String res ="";
        for (int i = 0; i < array.length; i++) {
            res += array[i] + " ";
        }
        return res;
    }
// метод добавления по индексу

    public String[] addIndex(int index, String name) {

        if (index<0){return null;}

        if (count==array.length){
            String [] arrayNew = Arrays.copyOfRange(array,0,array.length+1);
                for (int i = array.length-1; i >index ; i--) {
                    arrayNew [i+1] = arrayNew[i];
                }
                array=arrayNew;
        }
        array[index]=name;
        count++;

        return array;
    }

    // метод добавления по значению

    public String[] addName(String name) {

        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);//добавляем новый массив с длинной +1
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i <= array.length - 1) {
                arrayNew[j++] = array[i];
            }
            arrayNew[j] = name;
        }
        array = arrayNew;
        return array;
    }

    // метод удаления по индексу

    public String[] deleteIndex(int index) {


        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1
        if (index < 0||index> array.length) {
            System.out.println("Wrong");
        }
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
    public String[] deleteName( String name) {


        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                i++;
            }
            arrayNew[j++] = array[i];
        }
        array = arrayNew;
        return array;
    }

    //метод получения индекса по значению

    public int getIndex(String name) {

        int index = 0;

        for (int i = 0; i < array.length+1; i++) {

            if (array[i].equals(name)) {

                index = i;
                System.out.print("The index of element " + array[i] + " is ");

            }
        }
        return index;
    }
}



