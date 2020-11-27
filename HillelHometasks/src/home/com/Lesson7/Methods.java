package home.com.Lesson7;

import java.util.Arrays;

public class Methods {

    private int size;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add ( String [] array, int index, String name){

        for (int i = 0; i < array.length ; i++) {
            if (i == index){
                array[i] = name;
                System.out.println(Arrays.toString(array));
            }

        }

    }


}
