public class Shape {

    // parent class
    static class Shape {
        String color;

        Shape(String color) {
            this.color = color;
        }

        void displayColor() {
            System.out.println("Color: " + color);
        }

        double area() {
            return 0;
        }
    }

    // child class 1
    static class Circle extends Shape {
        double radius;

        Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }

        void display() {
            displayColor();
            System.out.println("Radius: " + radius);
            System.out.println("Area of Circle: " + String.format("%.2f", area()));
        }
    }

    // child class 2
    static class Rectangle extends Shape {
        double length, width;

        Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }

        void display() {
            displayColor();
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area of Rectangle: " + area());
        }
    }

    // child class 3
    static class Triangle extends Shape {
        double base, height;

        Triangle(String color, double base, double height) {
            super(color);
            this.base = base;
            this.height = height;
        }

        @Override
        double area() {
            return 0.5 * base * height;
        }

        void display() {
            displayColor();
            System.out.println("Base: " + base);
            System.out.println("Height: " + height);
            System.out.println("Area of Triangle: " + area());
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        System.out.println("--- Circle ---");
        c.display();

        Rectangle r = new Rectangle("Blue", 4, 6);
        System.out.println("\n--- Rectangle ---");
        r.display();

        Triangle t = new Triangle("Green", 3, 8);
        System.out.println("\n--- Triangle ---");
        t.display();
    }
}
