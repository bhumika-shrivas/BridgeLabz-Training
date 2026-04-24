import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //Declare variables
        double first, second;
        String op;

        //Take input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = input.next();

        //Perform operation using switch case
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } 
				else 
				{
                    System.out.println("Error: Division by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
