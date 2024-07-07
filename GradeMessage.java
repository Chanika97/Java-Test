public class GradeMessage {
    public static void main(String[] args) {
        System.out.print("Enter the grade (A, B, C, D, or F): ");
        String input = System.console().readLine(); 

        
        if (input.length() > 0) {
            char grade = input.charAt(0); 

            switch (grade) {
                case 'A':
                    System.out.println("Excellent job!");
                    break;
                case 'B':
                case 'C':
                    System.out.println("Good job!");
                    break;
                case 'D':
                    System.out.println("You passed, but there's room for improvement.");
                    break;
                default:
                    System.out.println("Sorry, you did not pass.");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please enter a grade (A, B, C, D, or F).");
        }
    }
}
