interface Payment {
    boolean processPayment(double amount);
    void printReceipt();
}
class CreditCard implements Payment {
    String cardNumber;
    CreditCard(String num) { this.cardNumber = num; }
    public boolean processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Credit Card: " + cardNumber);
        return true;
    }
    public void printReceipt() { System.out.println("Receipt: Credit Card payment successful."); }
}
class UPI implements Payment {
    String upiId;
    UPI(String id) { this.upiId = id; }
    public boolean processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via UPI: " + upiId);
        return true;
    }
    public void printReceipt() { System.out.println("Receipt: UPI payment successful."); }
}
class NetBanking implements Payment {
    String bankName;
    NetBanking(String bank) { this.bankName = bank; }
    public boolean processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Net Banking: " + bankName);
        return true;
    }
    public void printReceipt() { System.out.println("Receipt: Net Banking payment successful."); }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCard("XXXX-XXXX-1234"),
            new UPI("gurshan@upi"),
            new NetBanking("HDFC")
        };
        for (Payment p : payments) { p.processPayment(1500); p.printReceipt(); System.out.println(); }
    }
}