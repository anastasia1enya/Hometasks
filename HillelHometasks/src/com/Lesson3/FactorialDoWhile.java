package com.Lesson3;

public class FactorialDoWhile {
    public static void main(String[] args) {
        int i = 1;// вводим начальную точку
        int n = 6;// число факториал кот.нужно рассчитать
        int mult = 1;
        do {
            mult *= i;
            i++;
        }
        while (i <= n);

        System.out.println("Factorial of number " + n + " is:" + mult);
    }
}
