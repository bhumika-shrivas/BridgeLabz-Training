import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        //Take input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Initialize sum variable
        int sum = 0;

        //Find sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        //Check Abundant condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        input.close();
    }
}
