import java.util.*;

public class StringLength{

	// Method to find string length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            // Infinite loop to count characters
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
            return count;
        }
    }

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string : ");
		String text = input.next();
		
		int userLength = findLength(text);
		
		int builtInLength = text.length();
		
		System.out.println("\nLength using user-defined method: " + userLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        input.close();
		
	}
}
		