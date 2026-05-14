abstract class Device {
    String name;
    boolean isOn;
    Device(String name) { this.name = name; this.isOn = false; }
    void turnOn() { isOn = true; System.out.println(name + " turned ON"); }
    void turnOff() { isOn = false; System.out.println(name + " turned OFF"); }
    abstract void operate();
}
class Light extends Device {
    Light() { super("Smart Light"); }
    void operate() { System.out.println("Light is glowing at 80% brightness"); }
}
class AC extends Device {
    int temperature;
    AC(int temp) { super("Smart AC"); this.temperature = temp; }
    void operate() { System.out.println("AC cooling at " + temperature + "°C"); }
}
class TV extends Device {
    TV() { super("Smart TV"); }
    void operate() { System.out.println("TV streaming Netflix"); }
}
public class SmartHome {
    public static void main(String[] args) {
        Device[] devices = { new Light(), new AC(22), new TV() };
        for (Device d : devices) { d.turnOn(); d.operate(); d.turnOff(); System.out.println(); }
    }
}