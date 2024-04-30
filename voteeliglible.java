package task;

import java.util.Scanner;

public class voteeliglible {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String message = (age >= 18) ? "You are eligible to cast your vote!" : "Sorry, you are not eligible to vote yet.";

        System.out.println(message);

        scanner.close();
    }
    
}
