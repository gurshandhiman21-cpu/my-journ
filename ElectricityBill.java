abstract class Customer {
    String name;
    int unitsConsumed;
    Customer(String name, int units) { this.name = name; this.unitsConsumed = units; }
    abstract double calculateBill();
    void display() {
        System.out.println("Customer: " + name + " | Units: " + unitsConsumed + " | Bill: ₹" + calculateBill());
    }
}
class DomesticCustomer extends Customer {
    DomesticCustomer(String name, int units) { super(name, units); }
    double calculateBill() { return unitsConsumed * 5.5; }
}
class CommercialCustomer extends Customer {
    CommercialCustomer(String name, int units) { super(name, units); }
    double calculateBill() { return unitsConsumed * 9.0; }
}
class IndustrialCustomer extends Customer {
    IndustrialCustomer(String name, int units) { super(name, units); }
    double calculateBill() { return unitsConsumed * 7.0; }
}
public class ElectricityBill {
    public static void main(String[] args) {
        Customer[] list = {
            new DomesticCustomer("Gurshan", 200),
            new CommercialCustomer("Sharma Stores", 800),
            new IndustrialCustomer("ABC Factory", 5000)
        };
        for (Customer c : list) c.display();
    }
}