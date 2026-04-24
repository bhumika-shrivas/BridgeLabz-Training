import java.util.*;


public class LongestWord {
	

	// Mehtod to find longest word
	public static String longestWord (String sentence) {
		
		String[] words = sentence.split(" ");

		String longest = "";


		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		return longest;
	}


	public static void main(String[] args) {
	
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		
		String result = longestWord(sentence);

		// Display output
		System.out.println("Longest word in sentence is: " + result);

		input.close();
	}
}


			
			