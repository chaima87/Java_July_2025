public class Loops {
    public static void main(String[] args){
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Use a for loop to print all odd numbers on the same line
        // Expected output: 13579

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] %2 !=0){
                System.out.println(numbers[i]);
            }
        }
    }
}
