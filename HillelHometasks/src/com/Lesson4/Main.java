package com.Lesson4;

public class Main {

    public static void main(String[] args) {

        double sTotal = 478.8d; // расстояние Одесса - Киев
        double sStop1 = 177.8d;// расстоняие Одесса - Кривое Озеро (первая остановка)
        double sStop2 = 152.8d;// расстоняие Кривое Озеро - Жашков (вторая остановка)
        double sRest = sTotal-sStop1-sStop2; // остаток пути до Киева

        double price = 27.5d;// цена за 1 л


        Vehicle vehicle = new Vehicle(55.0,13.4d);
        vehicle.fuelBalance(sStop1);
        vehicle.fullTank();
        vehicle.fillUp(sStop1);

        vehicle.fuelBalance(sStop2);
        vehicle.fillUp(sStop2);
        vehicle.fullTank();
        vehicle.fuelBalance(sRest);


    }
}
