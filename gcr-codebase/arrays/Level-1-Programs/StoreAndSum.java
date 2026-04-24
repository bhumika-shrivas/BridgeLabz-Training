import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        //Declare array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner input = new Scanner(System.in);

        //Infinite while loop for input
        while (true) {

            System.out.print("Enter a number: ");
            double value = input.nextDouble();

            //Break if 0 or negative number
            if (value <= 0) {
                break;
            }

            //Break if array limit reached
            if (index == 10) {
                break;
            }

            //Store value and increment index
            numbers[index] = value;
            index++;
        }

        //Display numbers and calculate sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total = total + numbers[i];
        }

        //Display total
        System.out.println("\nTotal = " + total);

        input.close();
    }
}
