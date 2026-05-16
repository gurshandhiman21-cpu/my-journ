abstract class RentalCar {
    private String carName;
    private String regNumber;

    RentalCar(String carName, String regNo) { this.carName = carName; this.regNumber = regNo; }
    public String getCarName() { return carName; }
    public String getRegNumber() { return regNumber; }

    abstract double ratePerDay();

    double totalCost(int days) { return ratePerDay() * days; }

    void display(int days) {
        System.out.println("Car: " + carName + " | Reg: " + regNumber +
            " | Days: " + days + " | Total: ₹" + totalCost(days));
    }
}
class HatchbackCar extends RentalCar {
    HatchbackCar(String name, String reg) { super(name, reg); }
    double ratePerDay() { return 1500; }
}
class SUV extends RentalCar {
    SUV(String name, String reg) { super(name, reg); }
    double ratePerDay() { return 3000; }
}
class LuxuryCar extends RentalCar {
    LuxuryCar(String name, String reg) { super(name, reg); }
    double ratePerDay() { return 8000; }
}
public class CarRental {
    public static void main(String[] args) {
        RentalCar[] cars = {
            new HatchbackCar("Maruti Swift", "PB01AB1234"),
            new SUV("Mahindra XUV", "PB02CD5678"),
            new LuxuryCar("BMW 5 Series", "PB03EF9012")
        };
        int[] days = { 3, 5, 2 };
        for (int i = 0; i < cars.length; i++) { cars[i].display(days[i]); System.out.println(); }
    }
}
