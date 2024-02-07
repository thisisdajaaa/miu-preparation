package polymorphism.vehicle_system;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public abstract void start();

    public abstract void stop();
}
