import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {

        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled successfully!");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();

        // Call method that generates exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred and program flow interrupted.");
        }

        // Call method that handles exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        sc.close();
    }
}
