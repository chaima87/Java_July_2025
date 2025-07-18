
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeKiosk kiosk = new CoffeeKiosk();

        // Add New Item to the menu
        kiosk.addMenuItem("banana", 2.00);
        kiosk.addMenuItem("coffee", 1.50);
        kiosk.addMenuItem("latte", 4.50);
        kiosk.addMenuItem("cappuccino", 3.00);
        kiosk.addMenuItem("muffin", 4.00);

        // Menu display
        System.out.println("=== Menu ===");
        kiosk.displayMenu();

        // NewOrder
        System.out.println("\n=== NewOrder ===");
        kiosk.newOrder(scanner);

        scanner.close();

    }
}
