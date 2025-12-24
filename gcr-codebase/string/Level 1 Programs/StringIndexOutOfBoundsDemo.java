import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Accessing index beyond the string length
        // Valid indices: 0 to length-1
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Same invalid access
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First call method that generates exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred and program stopped abruptly.");
        }

        // Then call method that handles exception
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);

        sc.close();
    }
}
