abstract class Tax {
    double amount;
    Tax(double amount) { this.amount = amount; }
    abstract double calculateTax();
    void display() { System.out.println("Amount: ₹" + amount + " | Tax: ₹" + calculateTax()); }
}
class IncomeTax extends Tax {
    IncomeTax(double amount) { super(amount); }
    double calculateTax() { return amount * 0.20; }
}
class SalesTax extends Tax {
    SalesTax(double amount) { super(amount); }
    double calculateTax() { return amount * 0.08; }
}
class ServiceTax extends Tax {
    ServiceTax(double amount) { super(amount); }
    double calculateTax() { return amount * 0.12; }
}
public class TaxCalculator {
    public static void main(String[] args) {
        Tax[] taxes = { new IncomeTax(100000), new SalesTax(5000), new ServiceTax(8000) };
        String[] names = { "Income Tax", "Sales Tax", "Service Tax" };
        for (int i = 0; i < taxes.length; i++) { System.out.println(names[i]); taxes[i].display(); System.out.println(); }
    }
}