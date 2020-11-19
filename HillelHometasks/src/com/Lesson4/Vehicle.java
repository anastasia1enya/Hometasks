package com.Lesson4;

public class Vehicle {

    double tankVolume;
    double tankBalance;
    double fuelConsumption;

    // создаем конструктор

    public Vehicle(double tankVolume, double tankBalance, double fuelConsumption) {
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
        this.tankBalance = tankBalance;

    }

    public double Balance(double n) {
        double tankBalance = tankVolume - Math.round((fuelConsumption / 100) * n); // расчитываем баланс топлива
        System.out.println("The balance of fuel on the crossed " + n + " km is : " + tankBalance + " liters");
        return tankBalance;
    }


    public double fillUp(double n, double tankBalance) {
        double addFuel = tankVolume - tankBalance; // рассчитывем сколько надо заправить
        System.out.println("Yo need to fill up : " + addFuel + " liters, while crossing " + n + " km");
        return addFuel;

    }

    public double fullTank(double price, double tankBalance, double addFuel) {
        tankBalance = tankBalance + addFuel;// заправляем машину
        double newPrice = addFuel * price; // считаем стоитмость заправки
        System.out.println("Your car is full! Your balance is: " + tankBalance + " liters");
        System.out.println("We had add  " + addFuel + " liters.The price for it is: " + newPrice + " UAH");
        return newPrice;

    }

}
