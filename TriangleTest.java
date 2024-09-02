import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter side lengths
        System.out.print("Enter the length of side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side3: ");
        double side3 = scanner.nextDouble();

        // Clear the buffer
        scanner.nextLine();

        // Prompt the user to enter a color
        System.out.print("Enter the color: ");
        String color = scanner.nextLine();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = scanner.nextBoolean();

        // Create a Triangle object with the provided information
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        // Display the details of the triangle
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        scanner.close();
    }
}
