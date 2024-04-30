package task;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate the area of a triangle
        System.out.println("Calculate the area of a triangle:");
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = calculateTriangleArea(base, height);
        System.out.println("Area of the triangle: " + triangleArea);

        // Calculate the volume of a cube
        System.out.println("\nCalculate the volume of a cube:");
        System.out.print("Enter the side length of the cube: ");
        double cubeSide = scanner.nextDouble();
        double cubeVolume = calculateCubeVolume(cubeSide);
        System.out.println("Volume of the cube: " + cubeVolume);

        // Calculate the volume of a cuboid
        System.out.println("\nCalculate the volume of a cuboid:");
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();
        double cuboidVolume = calculateCuboidVolume(length, width, heightCuboid);
        System.out.println("Volume of the cuboid: " + cuboidVolume);

        scanner.close();
    }

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the volume of a cube
    public static double calculateCubeVolume(double side) {
        return side * side * side;
    }

    // Method to calculate the volume of a cuboid
    public static double calculateCuboidVolume(double length, double width, double height) {
        return length * width * height;
    }
    
}
