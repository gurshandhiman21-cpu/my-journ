abstract class Animal {
    String name;
    Animal(String name) { this.name = name; }
    abstract void sound();
    void eat() { System.out.println(name + " is eating."); }
}
class Dog extends Animal {
    Dog(String name) { super(name); }
    void sound() { System.out.println(name + " says: Woof!"); }
}
class Cat extends Animal {
    Cat(String name) { super(name); }
    void sound() { System.out.println(name + " says: Meow!"); }
}
class Bird extends Animal {
    Bird(String name) { super(name); }
    void sound() { System.out.println(name + " says: Tweet!"); }
}
public class AnimalSystem {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Bruno"), new Cat("Kitty"), new Bird("Tweety") };
        for (Animal a : animals) { a.sound(); a.eat(); System.out.println(); }
    }
}
