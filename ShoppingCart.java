public class ShoppingCart {
    public static void main(String[] args) {
        String[] itemCodes = {"A123", "B456", "C789"};
        double[] itemPrices = {10.99, 5.49, 2.99};

        double totalCost = 0.0;
        boolean shopping = true;

        while (shopping) {
            
            System.out.println("Available Items:");
            for (int i = 0; i < itemCodes.length; i++) {
                System.out.println(itemCodes[i] + " - $" + itemPrices[i]);
            }
            System.out.print("Enter item code (or 'done' to finish shopping): ");
            String itemCode = System.console().readLine();

            if (itemCode.equalsIgnoreCase("done")) {
                shopping = false;
            } else {
                boolean found = false;
                double price = 0.0;

                
                for (int i = 0; i < itemCodes.length; i++) {
                    if (itemCodes[i].equalsIgnoreCase(itemCode)) {
                        found = true;
                        price = itemPrices[i];
                        break;
                    }
                }

                if (found) {
                    totalCost += price;
                    System.out.println("Added item with code " + itemCode + " to cart. Price: $" + price);
                } else {
                    System.out.println("Error: Item code '" + itemCode + "' not recognized.");
                }
            }
        }

        
        System.out.println("Total cost of items in shopping cart: $" + totalCost);
    }
}
