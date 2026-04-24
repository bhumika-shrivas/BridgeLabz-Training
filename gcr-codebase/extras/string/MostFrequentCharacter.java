import java.util.Scanner;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		int[] freq = new int[256];

		for (int i = 0; i < text.length(); i++) {
			freq[text.charAt(i)]++;
		}

		char mostFrequent = text.charAt(0);
		int max = freq[mostFrequent];

		for (int i = 1; i < text.length(); i++) {
			if (freq[text.charAt(i)] > max) {
				max = freq[text.charAt(i)];
				mostFrequent = text.charAt(i);
			}
		}

		System.out.println("Most Frequent Character: '" + mostFrequent + "'");
		input.close();
	}
}
