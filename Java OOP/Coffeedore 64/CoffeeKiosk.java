import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size());
        menu.add(newItem);
    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item);
        }
    }

    public void newOrder(Scanner scanner) {
        System.out.println("Please enter customer name:");
        String name = scanner.nextLine();
        Order order = new Order(name);

        displayMenu();

        System.out.println("Enter item index to order, or 'q' to quit:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int itemIndex = Integer.parseInt(input);
                if (itemIndex >= 0 && itemIndex < menu.size()) {
                    order.addItem(menu.get(itemIndex));
                    System.out.println("Added: " + menu.get(itemIndex).getName());
                } else {
                    System.out.println("Invalid item index.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'q' to quit.");
            }
        }

        orders.add(order);
        System.out.println("Order summary:");
        order.display();
    }

    public void addMenuItemByInput(Scanner scanner) {
        System.out.println("Enter new item name:");
        String name = scanner.nextLine();
        System.out.println("Enter item price:");
        try {
            double price = Double.parseDouble(scanner.nextLine());
            addMenuItem(name, price);
            System.out.println("Item added to menu.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format. Item not added.");
        }
    }
}
