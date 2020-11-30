package home.com.Lesson7;

import java.util.Arrays;

public class Methods {

    // метод добавления по индексу
    public String[] addIndex(String[] array, int index, String name) {
        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1); //добавляем новый массив с длинной +1

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                arrayNew[j++] = name;

            }
            arrayNew[j++] = array[i];
        }
        System.out.println(Arrays.toString(arrayNew));
        return arrayNew;

    }


    // метод добавления по значению

    public String[] addName(String[] array, String name) {
        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);//добавляем новый массив с длинной +1
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= array.length) {
                arrayNew[j++] = array[i];
            }
            arrayNew[j] = name;

        }
        System.out.println(Arrays.toString(arrayNew));
        return arrayNew;
    }

    // метод удаления по индексу

    public String[] deleteIndex(String[] array, int index) {
        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                i++;

            }
            arrayNew[j++] = array[i];
        }
        System.out.println(Arrays.toString(arrayNew));
        return arrayNew;

    }

    // метод удаления по значению
    public String[] deleteName(String[] array, String name) {

        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length - 1);//добавляем новый массив с длинной -1
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(name)) {
                i++;
            }
            arrayNew[j++] = array[i];
        }

        System.out.println(Arrays.toString(arrayNew));
        return arrayNew;

    }

    //метод получения индекса по значению

    public void getIndex(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(name)) {
                System.out.println("The index of element " + array[i] + " is [" + i + "]");
            }

        }
    }


}
