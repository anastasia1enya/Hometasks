package com.Lesson3;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter the number");

        int n = scanner.nextInt();

        if (n>0) { //условие неотрицательности

            int res;

            System.out.println("The multiplication table of number " + n + " is:");

            for (int i = 1; i <= 10; i++) {

                res = i * n;
                System.out.println(i + "*" + n + " = " + res);

            }
        } else {
            System.out.println("Wrong number, try again");
        }
    }
}
