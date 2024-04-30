package task;

import java.util.Scanner;

public class studentinfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input roll number
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        // Input field of interest
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();

        // Print the information
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ".");
        System.out.println("My field of interest is " + fieldOfInterest + ".");

        scanner.close();
    }
    
}
