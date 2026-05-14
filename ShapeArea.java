class Shape {
    double area() { return 0; }
    void display() { System.out.println("Area: " + area()); }
}
class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }
    double area() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    double area() { return l * w; }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { this.base = b; this.height = h; }
    double area() { return 0.5 * base * height; }
}
public class ShapeArea {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Triangle(3, 8) };
        for (Shape s : shapes) { System.out.println(s.getClass().getSimpleName()); s.display(); System.out.println(); }
    }
}