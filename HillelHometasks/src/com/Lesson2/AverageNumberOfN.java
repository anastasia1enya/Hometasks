package com.Lesson2;

public class AverageNumberOfN {
    public static void main(String[] args) {
        int[] numbers = { 4,5,11};

        int sum =0; // вводим изначальное значение
        for (int i = 0; i <numbers.length; i++) {
             sum += numbers[i];
        }
        double average = sum/numbers.length;
        System.out.println("The average number of " + average);
        //System.out.println(numbers.toString());

    }

}
