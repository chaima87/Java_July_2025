public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 4.0;          // Changed from 3.5
        double dripCoffeePrice = 3.0;     // Changed from 2.5
        double lattePrice = 5.5;          // Changed from 4.5
        double cappuccinoPrice = 4.25;    // Changed from 3.85

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true; // for Cindhuri    // Changed from false
        boolean isReadyOrder2 = false;  // for Sam
        boolean isReadyOrder3 = true; // for Jimmy       // Changed from false
        boolean isReadyOrder4 = true;  // for Noah        

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        // customer 1:
        System.out.println(generalGreeting + customer1); 

    if (isReadyOrder1) {
        System.out.println(customer1 + readyMessage);
    } else {
        System.out.println(customer1 + pendingMessage);
    }

        // customer 4:
        System.out.println(generalGreeting + customer4);

    if (isReadyOrder4) {
        System.out.println(customer4 + readyMessage);
        System.out.println(displayTotalMessage + cappuccinoPrice);
    } else {
        System.out.println(customer4 + pendingMessage);
    }
       // customer 2:
       System.out.println(generalGreeting + customer2);
     // Calculate and display total for 2 lattes
     double samTotal = 2 * lattePrice;

    if (isReadyOrder2) {
        System.out.println(customer2 + readyMessage);
        System.out.println(displayTotalMessage + samTotal);
    } else {
        System.out.println(customer2 + pendingMessage);
    }
      // customer 3:
      // Calculate the difference Jimmy owes
    double difference = lattePrice - dripCoffeePrice;

    System.out.println(generalGreeting + customer3);
    System.out.println("Sorry " + customer3 + ", you were charged for a coffee but ordered a latte.");
    System.out.println(displayTotalMessage + difference);

    }
}
