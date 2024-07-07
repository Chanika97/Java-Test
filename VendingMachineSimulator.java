import java.util.Scanner;

public class VendingMachineSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Vending Machine!");

        while (true) {
            System.out.println("\nPlease select an item:");
            System.out.println("1. Cola");
            System.out.println("2. Chips");
            System.out.println("3. Candy");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting vending machine. Goodbye!");
                    return;
                case 1:
                    System.out.println("You have selected Cola. Enjoy your drink!");
                    break;
                case 2:
                    System.out.println("You have selected Chips. Enjoy your snack!");
                    break;
                case 3:
                    System.out.println("You have selected Candy. Enjoy your treat!");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid item.");
                    break;
            }
        }
    }
}
