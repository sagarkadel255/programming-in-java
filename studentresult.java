package task;

import java.util.Scanner;

public class studentresult {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks of four subjects
        System.out.println("Enter marks of four subjects:");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4;

        // Calculate percentage
        double percentage = (totalMarks / 4.0);

        // Generate final result
        String result = (percentage >= 70) ? "First Class"
                      : (percentage > 59) ? "Upper Second Class"
                      : (percentage > 49) ? "Second Class"
                      : (percentage > 39) ? "Third Class"
                      : "Fail";

        // Output total marks, percentage, and final result
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        scanner.close();
    }

    
}
