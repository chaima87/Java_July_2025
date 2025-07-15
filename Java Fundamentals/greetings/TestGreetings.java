public class TestGreetings {

    public String getCurrentDate() {
        return java.time.LocalDate.now().toString();
    }
    
    public static void main(String[] args) {
        
    	// To use the greetings methods
    	// create a variable of type Greetings
    
    	TestGreetings greeterApp = new TestGreetings();
 
    	// Use the variable to access Greetings methods
    	// using dot notation.
    
        String dateMessage = greeterApp.getCurrentDate();
        System.out.println(dateMessage);
    }
}

