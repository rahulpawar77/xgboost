class Shape {
    double calculateArea() {
        return 0;
    }
    void display() {
        System.out.println("Area of Shape : " + calculateArea());
    }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 3.15 * radius * radius;
    }
    @Override
    void display() {
        System.out.printf("Area of Circle : %.2f%n", calculateArea());
    }
}
class Rectangle extends Shape {
    private double length;
    private double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea() {
        return length * breadth;
    }
    @Override
    void display() {
        System.out.printf("Area of Rectangle : %.2f%n", calculateArea());
    }
}
class Triangle extends Shape {
    private double height;
    private double base;
    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
    @Override
    void display() {
        System.out.printf("Area of Triangle : %.2f%n", calculateArea());
    }
}
public class Geometry {
    public static void main(String[] args) {
        Shape shape1 = new Circle(9);
        Shape shape2 = new Rectangle(8, 2);
        Shape shape3 = new Triangle(9, 5);

        shape1.display();
        shape2.display();
        shape3.display();
    }
}