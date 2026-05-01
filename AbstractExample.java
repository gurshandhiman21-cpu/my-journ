public class AbstractExample {

    // abstract parent class
    abstract static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        // abstract method - must be implemented by child
        abstract void sound();

        // regular method
        void eat() {
            System.out.println(name + " is eating");
        }
    }

    // child class 1
    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        @Override
        void sound() {
            System.out.println(name + " says: Woof Woof!");
        }
    }

    // child class 2
    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        @Override
        void sound() {
            System.out.println(name + " says: Meow Meow!");
        }
    }

    // child class 3
    static class Cow extends Animal {
        Cow(String name) {
            super(name);
        }

        @Override
        void sound() {
            System.out.println(name + " says: Moo Moo!");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bruno");
        System.out.println("--- Dog ---");
        dog.sound();
        dog.eat();

        Cat cat = new Cat("Whiskers");
        System.out.println("\n--- Cat ---");
        cat.sound();
        cat.eat();

        Cow cow = new Cow("Bella");
        System.out.println("\n--- Cow ---");
        cow.sound();
        cow.eat();
    }
}