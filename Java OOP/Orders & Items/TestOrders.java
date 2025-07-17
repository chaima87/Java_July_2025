public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.00;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.50;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.25;

        // Orders
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        // Simulations
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %.2f\n", order1.total);  
        System.out.printf("Ready: %s\n", order1.ready);

        // Jimmy ordered a mocha
        order2.items.add(item1);
        order2.total += item1.price;

        // Noah ordered a cappuccino
        order3.items.add(item4);
        order3.total += item4.price;

        // Sam ordered a latte
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri’s order is ready
        order1.ready = true;

        // Sam ordered 2 more lattes
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        // Jimmy’s order is ready
        order2.ready = true;

        // Optional: Print all order summaries
        System.out.println("\n--- Order Summaries ---");
        printOrder(order1);
        printOrder(order2);
        printOrder(order3);
        printOrder(order4);
    }

    public static void printOrder(Order order) {
        System.out.println("Customer: " + order.name);
        System.out.println("Ready: " + order.ready);
        System.out.println("Items:");
        for (Item item : order.items) {
            System.out.printf("  - %s ($%.2f)\n", item.name, item.price);
        }
        System.out.printf("Total: $%.2f\n\n", order.total);
    }
}
