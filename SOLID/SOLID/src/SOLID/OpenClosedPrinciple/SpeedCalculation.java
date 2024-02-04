package SOLID.OpenClosedPrinciple;

public class SpeedCalculation {
    public double calculateAllowedSpeed(Car vehicle) {
        return vehicle.getMaxSpeed() * 0.8;

    }
    public double calculateAllowedSpeed(Bus vehicle) {
        return vehicle.getMaxSpeed() * 0.6;

    }
}
