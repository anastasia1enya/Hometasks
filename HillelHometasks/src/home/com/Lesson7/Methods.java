package home.com.Lesson7;

import java.util.Arrays;
import java.util.stream.Stream;

public class Methods {


    private String[] array;

    Methods() {
        array = new String[10];
    }

    public String toString() {
        String res = null;
        for (int i = 0; i < array.length; i++) {
            res += array[i] + " ";
        }
        return res;
    }

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
// метод добавления по индексу


    public String[] addIndex(int index, String name) {

        int size = array.length;

        for (int i = 0; i < size; i++) {

            if (index < 0) {
                return null;
            }
            if (index > size ) {

                String [] arrayNew = Arrays.copyOfRange(array, 0, size + 1);
                arrayNew [index-1]=name;
                count++;
                array = arrayNew;

                return array;

            }

            if (index < size ) {

                if (i == index || count == index) {

                    array[index] = name;
                    count++;

                }
                if (i == index || count != index) {

                    String [] arrayNew = new String[array.length+1];

                    System.arraycopy(array,0,arrayNew,index,array.length);
                    arrayNew[index] =name;
                    System.arraycopy(array,index-1,arrayNew,array.length,array.length);

                    array = arrayNew;
                    return array;

                }

            }



        }
///845454542525
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
        //System.out.println(Arrays.toString(arrayNew));
        return arrayNew;
    }

    // метод удаления по индексу

    public String[] deleteIndex(int index) {

        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1
        if (index < 0) {
            System.out.println("Wrong");
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                i++;

            }
            arrayNew[j++] = array[i];
        }
        //System.out.println(Arrays.toString(arrayNew));
        return arrayNew;

    }

    // метод удаления по значению
    public String[] deleteName(String[] array, String name) {
        this.array = array;

        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(name)) {
                i++;
            }
            arrayNew[j++] = array[i];
        }
        if (!array[array.length - 1].equals(name)) {
            System.out.println("Wrong");
        }

        //System.out.println(Arrays.toString(arrayNew));
        return arrayNew;

    }

    //метод получения индекса по значению

    public Integer getIndex(String[] array, String name) {
        this.array = array;
        Integer index = null;
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(name)) {
                index = i;
                System.out.print("The index of element " + array[i] + " is ");
                return index;
            }

        }
        System.out.print("Sorry, for " + name + " - no matches, ");
        return index;

    }

}


