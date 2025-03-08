interface Drivable {
    void drive();
}

// Base class
abstract class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increment) {  // Example of Data Coupling
        speed += increment;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    public abstract void displayInfo();
}

// Subclass 1
class Car extends Vehicle implements Drivable {
    private int numDoors;

    public Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    public void drive() { // Interface implementation
        System.out.println(brand + " car is driving.");
    }

    @Override
    public void displayInfo() { // Method overriding (Polymorphism)
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h, Doors: " + numDoors);
    }
}

// Subclass 2
class Motorcycle extends Vehicle implements Drivable {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive() { // Interface implementation
        System.out.println(brand + " motorcycle is driving.");
    }

    @Override
    public void displayInfo() { // Method overriding (Polymorphism)
        System.out.println("Motorcycle Brand: " + brand + ", Speed: " + speed + " km/h, Sidecar: " + hasSidecar);
    }
}

// Demonstration of Stamp Coupling
class VehicleService {
    public void inspectVehicle(Vehicle vehicle) { // Accepts an object (Stamp Coupling)
        System.out.println("Inspecting vehicle: ");
        vehicle.displayInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 100, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 80, false);
        
        car.drive();
        motorcycle.drive();
        
        car.accelerate(20);
        motorcycle.accelerate(15);
        
        VehicleService service = new VehicleService();
        service.inspectVehicle(car); // Stamp Coupling
        service.inspectVehicle(motorcycle);
    }
}
