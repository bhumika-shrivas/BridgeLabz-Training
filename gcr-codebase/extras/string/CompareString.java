import java.util.Scanner;

public class CompareString {

	// Mehtod to compare string
	public static void compareStrings(String s1, String s2) {

		int minLength = Math.min(s1.length(), s2.length());
		for (int i = 0; i < minLength; i++) {
			if (s1.charAt(i) < s2.charAt(i)) {
				System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
				return;
			} 
			else if (s1.charAt(i) > s2.charAt(i)) {
				System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
				return;
			}
		}

		if (s1.length() < s2.length()) {
			System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
		} 
		else if (s1.length() > s2.length()) {
			System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
		} 
		else {
			System.out.println("Both strings are equal");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String s1 = input.nextLine();

		System.out.print("Enter second string: ");
		String s2 = input.nextLine();

		compareStrings(s1, s2);

		input.close();
	}
}
