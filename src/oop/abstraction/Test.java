package oop.abstraction;

public class Test {

    public static void main(String[] args) {
        GeneralMotor gm= new GeneralMotor();
        gm.startCar();
        gm.acceleration();
        gm.carEngine();
        gm.CarSteering();
        gm.carWheel();
        gm.carBreak();
        gm.stopCar();
        gm.willBeAvailable(true);
        GeneralMotor.carInfo();
        gm.autoGear();
        gm.cameras();
        gm.emergencyBreak();
        gm.navigation();
        gm.dualClimateControl();
        gm.autoLaneControl();

    }
}
