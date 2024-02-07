package polymorphism.vehicle_system;

public class Car extends Vehicle{
    private String color;
    private Boolean isTrunkOpen;

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getTrunkOpen() {
        return isTrunkOpen;
    }

    public void setTrunkOpen(Boolean trunkOpen) {
        isTrunkOpen = trunkOpen;
    }
}
