import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check positive integer
        if (number <= 0) {
            System.out.println("Enter a positive number");
            System.exit(0);
        }

        // Create String array
        String[] array = new String[number + 1];
        int index = 0;

        // Store FizzBuzz results
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                array[index] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                array[index] = "Fizz";
            }
            else if (i % 5 == 0) {
                array[index] = "Buzz";
            }
            else {
                array[index] = String.valueOf(i);
            }

            index++;
        }

        // Print results
        for (int j = 0; j < index; j++) {
            System.out.println("Position " + (j + 1) + " = " + array[j]);
        }

        input.close();
    }
}
