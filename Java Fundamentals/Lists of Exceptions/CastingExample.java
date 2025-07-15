import java.util.ArrayList;

public class CastingExample {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of Objects
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Step 2: Loop through the list and attempt to cast to Integer
        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i); // risky cast
                System.out.println("Successfully casted value at index " + i + ": " + castedValue);
            } catch (ClassCastException e) {
                System.out.println("ClassCastException at index " + i + 
                                   " with value: " + myList.get(i));
                System.out.println("Error message: " + e.getMessage());
            }
        }

        System.out.println("Program continues running after exception handling.");
    }
}
