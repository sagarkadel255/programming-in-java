package task;

import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Input breadth of the rectangle
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area of the rectangle
        double area = length * breadth;

        // Type cast area to int
        int areaInt = (int) area;

        // Output area of the rectangle (type casted to int)
        System.out.println("Area of the rectangle (type casted to int): " + areaInt);

        scanner.close();
    }
    
}
