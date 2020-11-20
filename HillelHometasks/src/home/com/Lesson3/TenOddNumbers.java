package home.com.Lesson3;

import java.util.Arrays;

public class TenOddNumbers {

    public static void main(String[] args) {

        int[] array = new int[10];

        array[0]=1;

        for (int i = 1; i <=array.length-1 ; i++) {
            array[i] = array[i-1] +1;

        }

        System.out.println(Arrays.toString(array));


    }

}
