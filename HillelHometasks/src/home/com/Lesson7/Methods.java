package home.com.Lesson7;

import java.util.Arrays;
import java.util.stream.Stream;

public class Methods {


    private String[] array;

Methods(){
    array =new String[5];
}

    public String toString(){
    String res = null;
        for (int i = 0; i < array.length ; i++) {
            res+= array[i] + " ";
        }
    return res;
    }


    // метод добавления по индексу


    public String[] addIndex( int index, String name) {


        for (int i = 0; i < array.length; i++) {

            if (index<0){
                return null;
            }

            if (index >= array.length) {

                String [] arrayNew = Arrays.copyOfRange(array, 0, array.length + 1);
                array = arrayNew;
            }

            if (i == index && array[i] == null) {
                // System.out.println("i="+i);
                array[i] = name;

            }
                if (i == index && array[i] != null){

                    String[] arrayNew = Arrays.copyOfRange(array, 0, index);
                    //System.out.println(Arrays.toString(arrayNew));
                    String[] arrayNew1 = Arrays.copyOfRange(array, index, array.length);
                    //System.out.println(Arrays.toString(arrayNew1));
                    array[index] = name;
                    //System.out.println(i +"---"+ index+"---"+name);

                    return Stream.concat(Arrays.stream(arrayNew), Arrays.stream(arrayNew1))
                            .toArray(String[]::new);

                   // array[index]=name;
                    //System.out.println(Arrays.toString(array));


                }

        }

        return array;
    }
    // метод добавления по значению

    public String[] addName(String[] array, String name) {
        this.array = array;
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

    public String[] deleteIndex(String[] array, int index) {
        this.array = array;
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


