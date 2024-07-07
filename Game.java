import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Choose a character class:");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Archer");

            
            System.out.print("Enter the number corresponding to your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            
            String characterClass;
            switch (choice) {
                case 1:
                    characterClass = "Warrior";
                    break;
                case 2:
                    characterClass = "Mage";
                    break;
                case 3:
                    characterClass = "Archer";
                    break;
                default:
                    characterClass = "Unknown";  
                    break;
            }
            
            
            String specialAbility;
            switch (characterClass.toLowerCase()) {
                case "warrior":
                    specialAbility = "Berserk";
                    break;
                case "mage":
                    specialAbility = "Fireball";
                    break;
                case "archer":
                    specialAbility = "Precision Shot";
                    break;
                default:
                    specialAbility = "Unknown";  
                    break;
            }
            
           
            if (characterClass.equals("Unknown") || specialAbility.equals("Unknown")) {
                System.out.println("Error: Invalid choice.");
            } else {
                System.out.println("You have chosen " + characterClass);
                System.out.println("Special ability of " + characterClass + " is: " + specialAbility);
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
