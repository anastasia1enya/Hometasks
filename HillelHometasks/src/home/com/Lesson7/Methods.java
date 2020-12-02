package home.com.Lesson7;

import java.util.Arrays;

public class Methods {


    private String[] array;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    // метод добавления по индексу

    public String[] addIndex(String[] array, int index, String name) {
        this.array = array;

        for (int i = 0; i < array.length ; i++) {

                if (i == index) {
                    array[i] = name;

                } if (index> array.length){ grow(array,index);}

            }


        return array;

}

    public String[] grow (String[] array, int index){
        this.array = array;
        for (int i = 0; i < array.length*30 ; i++) {

            if (index> array.length){
                String[] arrayNew = Arrays.copyOfRange(array,0,array.length+1);


                for (int j = 0; j <i; j++) {

                    arrayNew[j]=array[j];
                }


                array = arrayNew;
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
