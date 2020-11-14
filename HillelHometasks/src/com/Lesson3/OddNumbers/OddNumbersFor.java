package com.Lesson3.OddNumbers;

public class OddNumbersFor {
    public static void main(String[] args) {

        System.out.println("Odd numbers are: ");

        for (int i = 0; i <= 99; i++) {

            if (i % 2 == 1) { //условие нечетности
                System.out.println(i);
            }
        }

    }
}
