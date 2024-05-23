//Create an abstract class Shape with abstract methods calculateArea() and display(). Implement concrete classes Circle and Rectangle inheriting from Shape with their own implementations.

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate the area
    abstract double calculateArea();

    // Abstract method to display the shape's details
    abstract void display();
}

// Concrete class Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of display method for Circle
    @Override
    public void display() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

// Concrete class Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of calculateArea method for Rectangle
    @Override
    double calculateArea() {
        return width * height;
    }

    // Implementation of display method for Rectangle
    @Override
    public void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a Circle object and display its details
        Shape circle = new Circle(5);
        circle.display();

        // Create a Rectangle object and display its details
        Shape rectangle = new Rectangle(4, 6);
        rectangle.display();
    }
}
