package task;

import java.util.Scanner;

public class geometrycalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side of a square
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();

        // Calculate area and perimeter of the square
        double squareArea = squareSide * squareSide;
        double squarePerimeter = 4 * squareSide;

        // Output area and perimeter of the square
        System.out.println("\nArea of the square: " + squareArea);
        System.out.println("Perimeter of the square: " + squarePerimeter);

        // Input principal amount, rate of interest, and time for Simple Interest
        System.out.println("\nCalculate Simple Interest:");
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output Simple Interest
        System.out.println("Simple Interest: " + simpleInterest);

        // Input base and height of the triangle
        System.out.println("\nCalculate Area of a Triangle:");
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate area of the triangle
        double triangleArea = 0.5 * base * height;

        // Output area of the triangle
        System.out.println("Area of the triangle: " + triangleArea);

        // Input side length of the cube
        System.out.println("\nCalculate Volume of a Cube:");
        System.out.print("Enter the side length of the cube: ");
        double cubeSide = scanner.nextDouble();

        // Calculate volume of the cube
        double cubeVolume = cubeSide * cubeSide * cubeSide;

        // Output volume of the cube
        System.out.println("Volume of the cube: " + cubeVolume);

        // Input dimensions of the cuboid
        System.out.println("\nCalculate Volume of a Cuboid:");
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();

        // Calculate volume of the cuboid
        double cuboidVolume = length * width * heightCuboid;

        // Output volume of the cuboid
        System.out.println("Volume of the cuboid: " + cuboidVolume);

        scanner.close();
    }
    
}
