interface Shape {
    double area();
}

class Rectangle implements Shape {
    int length = 10;
    int width = 5;

    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    int radius = 7;

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class OCPExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Circle Area: " + circle.area());
    }
}