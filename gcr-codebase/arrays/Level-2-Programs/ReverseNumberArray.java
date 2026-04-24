import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle 0 case
        if (number == 0) {
            System.out.println("Reversed number: 0");
            sc.close();
            return;
        }

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store reversed digits directly
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}
