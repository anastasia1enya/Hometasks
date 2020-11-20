package home.com.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ple enter the size of array");
        // задаем размер массива
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        // заполянем масив
        for (int i = 0; i < numbers.length - 1; i++) {

            numbers[i] = (int) (Math.round(Math.random() * 20)) - 10; // делаем диапазон рандомных чисел от -10 до 10

        }

        double sum = 0;
        // рассчитываемд сумму всех чисел

        for (int number : numbers) {

            sum += number;

        }
        // рассчитываем среднее арифметическое
        double average = sum / numbers.length;

        System.out.println("The average for numbers:" + Arrays.toString(numbers) + " is " + average);

    }

}

