public abstract class Phone {
    String brand;
    double price;
    Phone(String brand, double price) { this.brand = brand; this.price = price; }
    abstract void features();
    void display() { System.out.println("Brand: " + brand + " | Price: ₹" + price); }
}
class Smartphone extends Phone {
    String os;
    Smartphone(String brand, double price, String os) { super(brand, price); this.os = os; }
    void features() { System.out.println("OS: " + os + ", Touchscreen, Camera, Apps"); }
}
class Landline extends Phone {
    Landline(String brand, double price) { super(brand, price); }
    void features() { System.out.println("Wired, Basic calling only"); }
}
public class PhoneSystem {
    public static void main(String[] args) {
        Phone[] phones = { new Smartphone("Samsung", 25000, "Android"), new Landline("Beetel", 1500) };
        for (Phone p : phones) { p.display(); p.features(); System.out.println(); }
    }
} {
    
}
