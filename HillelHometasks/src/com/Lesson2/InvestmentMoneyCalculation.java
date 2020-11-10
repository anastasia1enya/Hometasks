package com.Lesson2;

import java.util.Scanner;

public class InvestmentMoneyCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pls press your previous value");
        int Pv = input.nextInt();//первоначальный вклад

        System.out.println("Pls press the percent");
        double p = input.nextDouble(); // процент

        System.out.println("Pls press the period of investment ");
        byte n = input.nextByte(); // количетсво лет на инвестирование

        System.out.println("Your income year by year:");

        for (int i = 1; i <= n; i++) {

            double Fv = Pv * (1 + (p / 100) * i); //формула расчета простых процентов

            System.out.println(i + " year you will get " + Fv + " UAH");
        }
        double finalP = p * n; // проенті за все n лет
        System.out.println();
        System.out.println("Total percent for all years : " + finalP);
    }
}
