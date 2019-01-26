package Main.Advanced.Inheritance;

public class Vehicle {
    private String name;
    protected int seatCapacity;
    public String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(String carType) {
        System.out.println("This is a" + carType + "vehicle.");
    }

    float maxSpeed;

    public void info() {
        System.out.println("This is a vehicle.");
    }

    public Vehicle(String name, int seatCapacity, String color, float maxSpeed) {
        this.name = name;
        this.seatCapacity = seatCapacity;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {

        return String.join(" | ",
                "VEHICLE",
                name,
                seatCapacity + " seats",
                color,
                maxSpeed + " km/h");
    }
}
