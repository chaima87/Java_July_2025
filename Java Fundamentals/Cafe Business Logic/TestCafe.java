import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        // Test 1: getStreakGoal
        System.out.println("\n----- Streak Goal Test -----");
        System.out.println("Purchases needed by week 10: " + appTest.getStreakGoal());

        // Ninja Bonus test
        System.out.println("Purchases needed by week 5: " + appTest.getStreakGoal(5));

        // Test 2: getOrderTotal
        System.out.println("\n----- Order Total Test -----");
        double[] orderPrices = {3.5, 1.5, 4.0, 4.5};
        System.out.println("Order total: $" + appTest.getOrderTotal(orderPrices));

        // Test 3: displayMenu
        System.out.println("\n----- Display Menu Test -----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        // Test 4: addCustomer
        System.out.println("\n----- Add Customer Test -----");
        ArrayList<String> customers = new ArrayList<String>();
        appTest.addCustomer(customers);

        // Test Ninja Bonus1: printPriceChart
        System.out.println("\n----- Price Chart Test -----");
        appTest.printPriceChart("Colombian Coffee Grounds", 2.00, 4);

        // Test Ninja Bonus 2:
        System.out.println("\n----- Price Chart Test -----");
        appTest.printPriceChart("Colombian Coffee Grounds", 2.00, 4);
        
        // Test Ninja Bonus 3: Overload the displayMenu method
        System.out.println("\n----- Display Menu With Prices Test -----");
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(2.5);
        prices.add(3.5);
        prices.add(4.5);
        prices.add(5.0);

        appTest.displayMenu(menu, prices);  // uses overloaded version
        
        // Test Ninja Bonus 4: Ninja Bonus 4: Implement the addCustomers method
        System.out.println("\n----- Add Multiple Customers Test -----");
        ArrayList<String> allCustomers = new ArrayList<String>();
        appTest.addCustomers(allCustomers);

    }
}
