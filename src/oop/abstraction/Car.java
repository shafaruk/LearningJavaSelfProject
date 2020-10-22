package oop.abstraction;

public interface Car {

    // Interface is the guideline for future
    // Interface has one specifier is used is call public
    // No concrete method

     String brand="Mercedes";
     int carQuantity=200;
     String seat="2";
     String headLight="4";
     boolean gasTank=true;

     // Create method without body

     public void startCar();

     public void stopCar();

     public void carWheel();

     public void carEngine();

     public void carBreak();

     public void CarSteering();

     public void acceleration();

     public static int carDoor(int doorNumber){
          int totalDoor=1*doorNumber;
          return totalDoor;
     }












}
