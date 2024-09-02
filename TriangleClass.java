
// GeometricObject.java: The abstract GeometricObject class
public abstract class TriangleClass {
  private String color = "white";
  private boolean filled;

  /**Default construct*/
  protected TriangleClass() {
  }

  /**Construct a geometric object*/
  protected TriangleClass(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**Getter method for color*/
  public String getColor() {
    return color;
  }

  /**Setter method for color*/
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
  public boolean isFilled() {
    return filled;
  }

  /**Setter method for filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**Abstract method findArea*/
  public abstract double getArea();

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();
}
//Create a Triangle before the main class.
public class Triangle extends TriangleClass {
    private double side1;
    private double side2;
    private double side3;

    //Constructor is default.
    public Triangle() {
        this(1.0, 1.0, 1.0); //All sides are 1.0.
    }
    public Triangle (double side1, double side2, double side3) {
        this(side1, side2, side3, "white", false); //Default color and filled status.
    }
    /** Constructor with side lengths.*/
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
    super(color, filled);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side1;
    }
    
    //side1 getter.
    public double getSide1() {
        return side1;
    }

    //side2 getter.
    public double getSide2() {
        return side1;
    }    

    //side3 getter.
    public double getSide3() {
        return side1;
    }

    //Implementation of getArea.
    double s = getPerimeter() / 2.0; //Semi perimeter.

    //Implementation of getPerimeter.
    public double getPerimeter () {
        return side1 + side2 + side3;
    }

    //Override the toString to provide a meaningful string representation.
    @Override
    public String toString() {
        return String.format("Triangle: side1=%.2f, side2=%.2f, side3=%.2f, color=%s, filled=%b", side1, side2, side3, getColor(), isFilled());
    }


}
