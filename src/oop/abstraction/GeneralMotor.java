package oop.abstraction;

public class GeneralMotor extends ModerCar implements Car{
    // Variable
    String carModel="Tesla Y";
    String modelYear="2022";

    //Method

    public static void carInfo(){
        System.out.println("This is general motor Car Information");
    }
    public boolean willBeAvailable(boolean availability){

        boolean releaseMonth=availability;
                return releaseMonth;
    }

    public void startCar() {
        System.out.println("Car has press button start");
    }

    public void stopCar() {
        System.out.println("Car has key stop feature");
    }

    public void carWheel() {
        System.out.println("Car has 20 inch sports wheel");
    }

    public void carEngine() {
        System.out.println("Car has 160 HP Engine ");
    }

    public void carBreak() {
        System.out.println("Car has hand Break");
    }

    public void CarSteering() {
        System.out.println("Car has Steering");
    }

    public void acceleration() {
        System.out.println("Car has acceleration");
    }

    public void navigation() {
        System.out.println("Car has navigation");
    }

    public void autoLaneControl() {
        System.out.println("Car has auto Lane control feature ");
    }

    public void selfDriven() {
        System.out.println("Car has self Driven feature");
    }

    public void cameras() {
        System.out.println("Car has 360 DG cameras");
    }

    public void emergencyBreak() {
        System.out.println("Car has Emergency break");
    }

    public void autoGear() {
        System.out.println("Car has auto Gear features");
    }
}
