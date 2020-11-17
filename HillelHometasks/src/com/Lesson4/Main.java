package com.Lesson4;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(55.0,15.0,2.1 );
        vehicle.fullTank();
        vehicle.fuelBalance(177.8);
        vehicle.fillUp(177.8);
        vehicle.fullTank();
        vehicle.fuelBalance(330.6);
        vehicle.fillUp(330.6);

    }
}
