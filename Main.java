import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number > 0) {
                if (number % 2 == 0) {
                    // Case 1: Input is even
                    System.out.println("Even numbers from 2 to " + number + ":");
                    for (int i = 2; i <= number; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                } else {
                    // Case 2: Input is odd
                    switch (number) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                        default:
                            System.out.println("Invalid input. Please enter a number between 1 and 7.");
                    }
                }
            } else {
                // Case 3: Input is negative
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        } catch (Exception e) {
            System.out.println("Error reading input. Please enter a valid integer.");
        }
    }
}
