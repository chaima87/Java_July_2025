public class Exceptions {
    public static void main(String[] args){
        int[] numbers = {5, 10, 50, 0, 2};
        // Use a for loop to divide 100 by each number and print the quotient:
        // Use a try/catch block to prevent a crash due to a zero division error (ArithmeticException)
        // Handle the exception by printing 'Cannot divide by zero.'

        for (int i = 0; i < numbers.length; i++) {
            try {
                int result = 100 / numbers[i];
                System.out.println("100 divided by " + numbers[i] + " is " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
}