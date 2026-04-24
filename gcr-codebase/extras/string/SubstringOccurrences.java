import java.util.*;


public class SubstringOccurrences {


	// Mehtod to find occurences of string
	public static int substringOccurences (String text, String sub) {
		int count = 0;
		
		for (int i = 0; i <= text.length() - sub.length(); i++) {
			int j;

			for (j = 0; j < sub.length(); j++) {
				if(text.charAt(i + j) != sub.charAt(j)) {
					break;
				}
			}

			if (j == sub.length()) {
				count++;
			}
		}
		return count;
	}
				


	public static void main (String[] args) {

		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String text = input.nextLine();
		System.out.print("Enter substring: ");
		String sub = input.nextLine();

		int result = substringOccurences(text, sub);

		// Display output
		System.out.print("Number of occurence: " + result);
	
		input.close();
		
	}
}