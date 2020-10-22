package oop.abstraction;

public abstract class ModerCar {


    String moderCarBrand="Tesla";
    double modernCarSuggestedPrice=65000;

    // Method
    public abstract void navigation();

    public abstract void autoLaneControl();
    public abstract void selfDriven();
    public abstract void cameras();
    public abstract void emergencyBreak();
    public abstract void autoGear();


    public void dualClimateControl(){

        System.out.println("Modern Car has Dual Climate Control");
    }




}
