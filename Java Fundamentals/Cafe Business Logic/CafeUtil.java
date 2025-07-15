import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CafeUtil {

    // Method 1: Get streak goal - default 10 weeks
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Ninja Bonus: Get streak goal with a parameter
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    // Method 2: Get order total
    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Method 3: Display menu items with index
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // Method 4: Add a customer to the list
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(username);
        System.out.println(customers);
    }

    // Ninja Bonus1:
    //public void printPriceChart(String product, double price, int maxQuantity) {
    //System.out.println(product);
    //for (int i = 1; i <= maxQuantity; i++) {
        //double total = price * i;
        //System.out.printf("%d - $%.2f\n", i, total);
    //}
    //}

    // Ninja Bonus 2:

    public void printPriceChart(String product, double price, int maxQuantity) {
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);  // for USD formatting

    System.out.println(product);
    for (int i = 1; i <= maxQuantity; i++) {
        double total = price * i;
        System.out.println(i + " - " + currency.format(total));
    }
}
    // Ninja Bonus 3: Overload the displayMenu method
    public void displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

    for (int i = 0; i < menuItems.size(); i++) {
        String priceFormatted = currency.format(prices.get(i));
        System.out.println(i + " " + menuItems.get(i) + " -- " + priceFormatted);
    }
}
    // Ninja Bonus 4:Ninja Bonus 4: Implement the addCustomers method

    public void addCustomers(ArrayList<String> customers) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many customers are you adding today? ");
    int numCustomers = input.nextInt();
    input.nextLine(); // consume newline

    for (int i = 0; i < numCustomers; i++) {
        System.out.print("Please enter customer name #" + (i + 1) + ": ");
        String username = input.nextLine();

        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(username);
        System.out.println("Current customer list: " + customers);
    }
}

}


