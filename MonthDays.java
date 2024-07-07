public class MonthDays {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter the Month Number");
            return;
        }
        
        int month = Integer.parseInt(args[0]);
        int days;

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
                days = 28; // Assuming non-leap year
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return;
        }

        System.out.println("Number of days in month " + month + " is: " + days);
    }
}
