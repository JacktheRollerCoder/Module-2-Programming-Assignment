public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // Default constructor: all sides are 1.0
    public Triangle() {
        this(1.0, 1.0, 1.0); // All sides are 1.0
    }

    // Constructor with side lengths, default color is "white" and filled status is false
    public Triangle(double side1, double side2, double side3) {
        this(side1, side2, side3, "white", false); // Default color and filled status
    }

    // Constructor with side lengths, color, and filled status
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3; // Fixed the assignment here
    }

    // Getter for side1
    public double getSide1() {
        return side1;
    }

    // Getter for side2
    public double getSide2() {
        return side2;
    }

    // Getter for side3
    public double getSide3() {
        return side3;
    }

    // Implementation of getArea using Heron's formula
    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementation of getPerimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Override toString to provide a meaningful string representation
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}
