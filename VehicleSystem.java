abstract class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand, int speed) { this.brand = brand; this.speed = speed; }
    abstract void fuelType();
    void display() { System.out.println(brand + " | Speed: " + speed + " km/h"); }
}
class Car extends Vehicle {
    Car(String brand, int speed) { super(brand, speed); }
    void fuelType() { System.out.println("Fuel: Petrol/Diesel"); }
}
class ElectricBike extends Vehicle {
    ElectricBike(String brand, int speed) { super(brand, speed); }
    void fuelType() { System.out.println("Fuel: Electric"); }
}
class Truck extends Vehicle {
    Truck(String brand, int speed) { super(brand, speed); }
    void fuelType() { System.out.println("Fuel: Diesel"); }
}
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] v = { new Car("Toyota", 180), new ElectricBike("Ather", 90), new Truck("Tata", 120) };
        for (Vehicle x : v) { x.display(); x.fuelType(); System.out.println(); }
    }
}
