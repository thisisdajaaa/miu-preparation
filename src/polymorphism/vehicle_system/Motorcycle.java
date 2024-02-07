package polymorphism.vehicle_system;

public class Motorcycle extends Vehicle {
    private Integer cc;

    @Override
    public void start() {
        System.out.println("Motorcycle start");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stop");
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }
}
