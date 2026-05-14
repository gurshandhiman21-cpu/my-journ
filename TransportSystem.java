abstract class Transport {
    String name;
    int capacity;
    Transport(String name, int capacity) { this.name = name; this.capacity = capacity; }
    abstract double ticketPrice();
    void display() {
        System.out.println(name + " | Capacity: " + capacity + " | Ticket: ₹" + ticketPrice());
    }
}
class Bus extends Transport {
    Bus() { super("Bus", 50); }
    double ticketPrice() { return 30; }
}
class Train extends Transport {
    Train() { super("Train", 500); }
    double ticketPrice() { return 150; }
}
class Flight extends Transport {
    Flight() { super("Flight", 200); }
    double ticketPrice() { return 5000; }
}
public class TransportSystem {
    public static void main(String[] args) {
        Transport[] t = { new Bus(), new Train(), new Flight() };
        for (Transport x : t) x.display();
    }
}
