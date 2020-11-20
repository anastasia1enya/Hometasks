package home.com.Lesson3;

import java.util.Arrays;

public class ReplaceMinMaxElement {

    public static void main(String[] args) {

        int[] array = { 6,8,-10,258,66,85,69};
        //задааем мин. элемент = первому элементу массива
        int min = array[0];
        //задааем макс. элемент = первому элементу массива
        int max = array[0];

           // выводим массив
        System.out.println("The array is: " + Arrays.toString(array));


        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] < min) { // сравниваем минимальные значения
                min = array[i];
            }
            if (array[i] > max) { // сравниваем максимальные значения
                max = array[i];
            }
        }

        // выводим мин./макс. значение (-я) и меняем их местами

        for (int i = 0; i < array.length; i++) {
            if (min == array[i]) {
                System.out.println("The minimum is : " + min + " index[" + i + "] ");
                array[i]=max;
            } else if (max == array[i]) {
                System.out.println("The maximum is : " + max + " index[" + i + "] ");
                array[i]=min;
            }
        }

        // выводим новый массив
        System.out.println("The new array is: " + Arrays.toString(array));
    }

}
