import java.util.Scanner;

public class PalindromeCheck
{

	public static void main(String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.next();

        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        input.close();
    }
}