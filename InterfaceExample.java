public class InterfaceExample {

    // interface 1
    interface Playable {
        void play();
    }

    // interface 2
    interface Chargeable {
        void charge();
    }

    // class implementing both interfaces
    static class Smartphone implements Playable, Chargeable {
        String brand;

        Smartphone(String brand) {
            this.brand = brand;
        }

        @Override
        public void play() {
            System.out.println(brand + " is playing music!");
        }

        @Override
        public void charge() {
            System.out.println(brand + " is charging!");
        }

        void displayInfo() {
            System.out.println("Brand: " + brand);
        }
    }

    // another class implementing Playable
    static class Guitar implements Playable {
        String type;

        Guitar(String type) {
            this.type = type;
        }

        @Override
        public void play() {
            System.out.println(type + " guitar is playing music!");
        }
    }

    public static void main(String[] args) {
        Smartphone s = new Smartphone("Samsung");
        System.out.println("--- Smartphone ---");
        s.displayInfo();
        s.play();
        s.charge();

        Guitar g = new Guitar("Acoustic");
        System.out.println("\n--- Guitar ---");
        g.play();
    }
}
