import java.util.Scanner;

public class calculatesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the principle amount
        System.out.print("Enter the principle amount: ");
        double principle = scanner.nextDouble();

        // Input the time (in years)
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Input the rate of interest
        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = (principle * time * rate) / 100;

        // Output the result
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
    
}
