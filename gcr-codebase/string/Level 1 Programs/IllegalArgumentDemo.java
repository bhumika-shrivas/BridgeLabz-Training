import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {

        int start = 5;
        int end = 2;

        // Manually throwing IllegalArgumentException
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }

        System.out.println(text.substring(start, end));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        int start = 5;
        int end = 2;

        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index");
            }

            System.out.println(text.substring(start, end));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled successfully!");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred and program flow interrupted.");
        }

        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        sc.close();
    }
}
