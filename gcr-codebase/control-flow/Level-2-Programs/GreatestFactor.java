import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int greatestFactor = 1;

        if (number <= 1) {
            System.out.println("No greatest factor exists");
        } else {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest factor (besides itself) is: " + greatestFactor);
        }

        input.close();
    }
}
