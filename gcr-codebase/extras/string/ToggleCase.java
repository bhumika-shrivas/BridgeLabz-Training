import java.util.*;

public class ToogleCase {
	
	// Mehtod to convert lowercase to uppercase and vice versa
	public static String toogleCase (String text) {
		
		char[] chars = text.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				chars[i] = (char) (chars[i] + 32);
			} else if (chars[i] >= 'a' && chars[i] <= 'z') {
				chars[i] = (char) (chars[i] - 32);
			}

		}
		return new String(chars);
	}

	
	public static void main (String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		String result = toogleCase(text);

		// Display output
		System.out.println("Converted string is: " + result);

		input.close();

	}
}