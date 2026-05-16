abstract class Loan {
    private String applicantName;
    private double loanAmount;

    Loan(String name, double amount) { this.applicantName = name; this.loanAmount = amount; }

    public String getName() { return applicantName; }
    public double getAmount() { return loanAmount; }

    abstract double interestRate();

    double totalRepayment() { return loanAmount + (loanAmount * interestRate() / 100); }

    void display() {
        System.out.println("Applicant: " + applicantName +
            " | Loan: ₹" + loanAmount +
            " | Rate: " + interestRate() + "%" +
            " | Repayment: ₹" + totalRepayment());
    }
}
class HomeLoan extends Loan {
    HomeLoan(String name, double amount) { super(name, amount); }
    double interestRate() { return 8.5; }
}
class CarLoan extends Loan {
    CarLoan(String name, double amount) { super(name, amount); }
    double interestRate() { return 10.5; }
}
class EducationLoan extends Loan {
    EducationLoan(String name, double amount) { super(name, amount); }
    double interestRate() { return 7.0; }
}
public class BankLoanSystem {
    public static void main(String[] args) {
        Loan[] loans = {
            new HomeLoan("Gurshan", 2000000),
            new CarLoan("Rahul", 500000),
            new EducationLoan("Priya", 300000)
        };
        for (Loan l : loans) { l.display(); System.out.println(); }
    }
}
