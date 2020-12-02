package home.com.Lesson7;

import java.util.Arrays;

public class Test {

    private String[] array;
    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    // метод добавления по индексу
    public String[] grow(String[] array, int index) {
        this.array = array;


        for (int i = 0; i < array.length*30; i++) {

                    if (index >= array.length) {
                        String[]arrayNew = new String[i + (i >> 1)];
                        for (int j = 0; j < i; j++) {
                            arrayNew[j] = array[j];

                        }
                        array = arrayNew;
                    }

            //} if (index < 0) {
            //    System.out.println("Wrong");
            //}
        }
        // System.out.println(Arrays.toString(arrayNew));
        return array;
    }
    public String[] addIndex(String[] array, int index, String name) {
        this.array = array;
        //grow(array,index);

        String[] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1); //добавляем новый массив с длинной +1

        int j = 0;
        int k=0;
        for (int i = 0+k; i < array.length; i++) {
            ++k;
            if (i == index) {
                arrayNew[j++] = name;

            }
            arrayNew[j++] = array[i];

        }

        array = arrayNew;

            //} if (index < 0) {
            //    System.out.println("Wrong");
            //}

        // System.out.println(Arrays.toString(arrayNew));
        return array;
    }


}
