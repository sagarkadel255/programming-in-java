package task;

import java.util.Scanner;

public class maximumnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        // Find maximum
        int max = num1; // Assume num1 is maximum initially

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        // Output maximum
        System.out.println("Maximum number is: " + max);

        scanner.close();
    }
    
}
