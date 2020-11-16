package com.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMaxElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ple enter the size of array");
        // задаем размер массива
        int n = scanner.nextInt();
        int[] array = new int[n];
        //задааем макс. элемент = первому элементу массива
        int max = array[0];
        // заполняем и выводим массив

        for (int i = 0; i < array.length - 1; i++) {

            array[i] = (int) (Math.round(Math.random() * 20)) - 10; // делаем диапазон рандомных чисел от -10 до 10
            if (array[i] > max) { // сравниваем максимальные значения
                max = array[i];
            }
        }
        System.out.println("The array is: " + Arrays.toString(array));
        // выводим мин. значение (-я)
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                System.out.println("The maximum is : " + max + " index[" + i + "] ");
            }
        }
    }

}
