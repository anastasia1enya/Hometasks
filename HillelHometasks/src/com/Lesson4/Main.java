package com.Lesson4;

public class Main {

    public static void main(String[] args) {

        double sTotal = 478.8d; // расстояние Одесса - Киев
        double sStop1 = 177.8d;// расстоняие Одесса - Кривое Озеро (первая остановка)
        double sStop2 = 152.8d;// расстоняие Кривое Озеро - Жашков (вторая остановка)
        double sRest = sTotal - sStop1 - sStop2; // остаток пути до Киева

        double price = 27.5d;// цена за 1 л

        // создаем экземпляр класса
        Vehicle vehicle = new Vehicle(55.0d, 0, 13.4d);

        //заправляем машину для поездки
        double fillStart = vehicle.fullTank(27.5d, 0d, 55.0d);

        //заправляем машину на первой остановке - Кривое Озеро
        double tankBalanceStop1 = vehicle.Balance(177.8d);
        double addFuelStop1 = vehicle.fillUp(177.8d, tankBalanceStop1);
        double fillStop1 = vehicle.fullTank(price, tankBalanceStop1, addFuelStop1);

        //заправляем машину на второй остановке - Жашков
        double tankBalanceStop2 = vehicle.Balance(152.8d);
        double addFuelStop2 = vehicle.fillUp(152.8d, tankBalanceStop2);
        double fillStop2 = vehicle.fullTank(price, tankBalanceStop2, addFuelStop2);

        // вычисляем остаток в Киеве
        double tankBalanceFinal = vehicle.Balance(sRest);

        double totalPrice = fillStart + fillStop1 + fillStop2;

        System.out.println("The rest fuel in Kiev is " + tankBalanceFinal + " liters");
        System.out.println("total price for trip is " + totalPrice + " UAH");

    }
}
