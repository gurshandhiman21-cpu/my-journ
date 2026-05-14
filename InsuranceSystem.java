abstract class Insurance {
    String holderName;
    double premium;
    Insurance(String name, double premium) { this.holderName = name; this.premium = premium; }
    abstract double coverage();
    void display() {
        System.out.println("Holder: " + holderName + " | Premium: ₹" + premium + " | Coverage: ₹" + coverage());
    }
}
class LifeInsurance extends Insurance {
    LifeInsurance(String name, double premium) { super(name, premium); }
    double coverage() { return premium * 50; }
}
class CarInsurance extends Insurance {
    CarInsurance(String name, double premium) { super(name, premium); }
    double coverage() { return premium * 10; }
}
class HealthInsurance extends Insurance {
    HealthInsurance(String name, double premium) { super(name, premium); }
    double coverage() { return premium * 20; }
}
public class InsuranceSystem {
    public static void main(String[] args) {
        Insurance[] list = {
            new LifeInsurance("Gurshan", 5000),
            new CarInsurance("Rahul", 3000),
            new HealthInsurance("Priya", 2000)
        };
        for (Insurance i : list) { i.display(); System.out.println(); }
    }
}