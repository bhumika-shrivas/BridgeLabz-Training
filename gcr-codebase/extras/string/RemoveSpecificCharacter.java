import java.util.Scanner;

public class RemoveSpecificCharacter {

	// Method to remove specific character
	public static String removeCharacter(String text, char ch) {
		String result = "";

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ch) {
				result += text.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		// Take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String text = sc.nextLine();
		System.out.print("Enter character to remove: ");
		char ch = sc.next().charAt(0);

		String modified = removeCharacter(text, ch);
		System.out.println("Modified String: \"" + modified + "\"");

		sc.close();
	}
}
