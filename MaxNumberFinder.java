import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            
            int max = Math.max(num1, num2);

            
            System.out.println("The maximum number is: " + max);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
