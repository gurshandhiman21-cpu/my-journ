interface Flyable {
    void fly();
    default void land() { System.out.println("Landing safely..."); }
}
interface Swimmable {
    void swim();
}
class Eagle implements Flyable {
    public void fly() { System.out.println("Eagle soaring at 3000m!"); }
}
class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck flying low!"); }
    public void swim() { System.out.println("Duck swimming in the pond!"); }
}
class Fish implements Swimmable {
    public void swim() { System.out.println("Fish swimming deep underwater!"); }
}
public class Flyable {
    public static void main(String[] args) {
        Eagle e = new Eagle(); e.fly(); e.land();
        System.out.println();
        Duck d = new Duck(); d.fly(); d.swim(); d.land();
        System.out.println();
        Fish f = new Fish(); f.swim();
    }
}
