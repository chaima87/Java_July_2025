public class TestOrders {
    public static void main(String[] args) {
        // Create some items
        //Item coffee = new Item("Drip Coffee", 1.50);
        //Item cappuccino = new Item("Cappuccino", 3.50);
        //Item latte = new Item("Latte", 4.00);

        // Create an order
        //Order order1 = new Order("Cindhuri");
        //order1.addItem(coffee);
        //order1.addItem(cappuccino);

        // Display order
        //order1.display();
        //System.out.println(order1.getStatusMessage());

        // Update order
        //order1.setReady(true);
        //System.out.println(order1.getStatusMessage());

        // Create two guest orders using the default constructor
        Order guestOrder1 = new Order();
        Order guestOrder2 = new Order();

        // Add items to each guest order
        guestOrder1.addItem(new Item("Drip Coffee", 1.50));
        guestOrder1.addItem(new Item("Bagel", 2.00));

        guestOrder2.addItem(new Item("Latte", 4.25));

        // Display both guest orders
        System.out.println("Guest Order 1:");
        guestOrder1.display();
        System.out.println();

        System.out.println("Guest Order 2:");
        guestOrder2.display();
        System.out.println();

        // === Create 3 named orders ===
        Order orderA = new Order("Alice");
        Order orderB = new Order("Bob");
        Order orderC = new Order("Charlie");

        // Add items to each order
        orderA.addItem(new Item("Cappuccino", 3.50));
        orderA.addItem(new Item("Muffin", 2.00));

        orderB.addItem(new Item("Espresso", 2.25));

        orderC.addItem(new Item("Latte", 4.25));
        orderC.addItem(new Item("Croissant", 3.00));
        orderC.addItem(new Item("Orange Juice", 2.50));

        // Display each order
        System.out.println("Named Order A:");
        orderA.display();
        System.out.println();

        System.out.println("Named Order B:");
        orderB.display();
        System.out.println();

        System.out.println("Named Order C:");
        orderC.display();
        System.out.println();

        // Create named and guest orders
        Order order1 = new Order("Alice");
        Order order2 = new Order("Bob");
        Order order3 = new Order("Charlie");
        Order guest1 = new Order();
        Order guest2 = new Order();

        // Add items to each order
        order1.addItem(new Item("Latte", 4.25));
        order1.addItem(new Item("Croissant", 3.00));

        order2.addItem(new Item("Drip Coffee", 1.50));
        order2.addItem(new Item("Bagel", 2.50));

        order3.addItem(new Item("Cappuccino", 3.50));
        order3.addItem(new Item("Muffin", 2.00));

        guest1.addItem(new Item("Espresso", 2.25));
        guest1.addItem(new Item("Donut", 1.75));

        guest2.addItem(new Item("Mocha", 3.75));
        guest2.addItem(new Item("Scone", 2.25));

        // Set some orders to ready
        order1.setReady(true);
        guest2.setReady(true);

        // Print status messages for each order
        System.out.println("Order 1 (Alice): " + order1.getStatusMessage());   
        System.out.println("Order 2 (Bob): " + order2.getStatusMessage());     
        System.out.println("Order 3 (Charlie): " + order3.getStatusMessage()); 
        System.out.println("Guest Order 1: " + guest1.getStatusMessage());     
        System.out.println("Guest Order 2: " + guest2.getStatusMessage()); 

        // Create and populate neworder
        Order neworder = new Order("Alice");
        neworder.addItem(new Item("Latte", 4.25));
        neworder.addItem(new Item("Croissant", 3.00));

        // Print the total directly using getOrderTotal()
        System.out.println("NewOrder Total:");
        System.out.println(neworder.getOrderTotal());     
    }
}
