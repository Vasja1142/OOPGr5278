package SOLID.DependencyInversionPrinciple;

public class Car {
    private Engine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }

}
