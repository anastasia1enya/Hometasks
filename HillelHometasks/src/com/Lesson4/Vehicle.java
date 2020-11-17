package com.Lesson4;

public class Vehicle {

     double tankVolume;
     double tankBalance;
     double fuelConsumption;

     public Vehicle(double tankVolume,double tankBalance, double fuelConsumption){
         this.tankVolume = tankVolume;
         this.tankBalance = tankBalance;
         this.fuelConsumption = fuelConsumption;

     }

     public void fullTank (){
         double addFuel = tankVolume - tankBalance;
         System.out.println("Your car is full! We had add  " + addFuel);
     }
    public void fuelBalance (double n){
        double tankBalance = tankVolume - ((fuelConsumption/100) * n);
        System.out.println("The balance of fuel on the crossed km " + n + " is : " + tankBalance + " liters");
    }

    public void fillUp (double n){
        double fuel = tankVolume - (  (fuelConsumption/100) * n);
        System.out.println("Yo need to fill up : " + fuel + " liters, while crossing " + n + " km");

    }
    /*

    Одесса - Киев 478,8 км
    Одесса - Кривое Озеро 177,8 км
    Кривое Озеро - Жашков 152,8  км
    Жашков - Киев 148,2  км
    топливо - 28 грн/л
    объем обычной машины -55 л

    */

}
