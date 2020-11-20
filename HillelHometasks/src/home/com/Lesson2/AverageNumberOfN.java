package home.com.Lesson2;

import java.util.Arrays;

public class AverageNumberOfN {
    public static void main(String[] args) {
        int[] Numbers = {5, 6, 7, 89, 10};
        double sum = 0;
        // рассчитываемд сумму всех чисел

        for (int number : Numbers) {

            sum += number;

        }
        // рассчитываем среднее арифметическое
        double average = sum / Numbers.length;

        System.out.println("The average for numbers:" + Arrays.toString(Numbers) + " is " + average);

    }

}

