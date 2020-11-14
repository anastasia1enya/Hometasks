package com.Lesson3.OddNumbers;

public class OddNumbersDoWhile {
    public static void main(String[] args) {

        System.out.println("Odd numbers are: ");

        int i = 1;

        do {
            if (i % 2 == 1) { //условие нечетности
                System.out.println(i);
            }
            i++;
        }
        while (i <= 99);
    }
}




