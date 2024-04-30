package task;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Input second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Calculate product
        int product = num1 * num2;

        // Output sum and product
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        scanner.close();
    }
    
}
