import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Number of terms must be greater than zero.");
                return;
            }

            int current = 1;

            for (int i = 0; i < n; i++) {
                
                if (current % 3 != 0 || current % 5 == 0) {
                    System.out.println(current);
                }

                
                double next = current + Math.sqrt(current);
                current = (int) Math.round(next);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
