package com.Lesson3;

public class OddNumbersWhile {
    public static void main(String[] args) {

        System.out.println("Odd numbers are: ");

        int i = 1;

        while (i <= 99) {
            if (i % 2 == 1) { //условие нечетности
                System.out.println(i);
            }
            i++;

        }

    }

}




