import java.util.Scanner;

public class RemoveDuplicates 
{
	//method
	static String removeDuplicates(String str) 
	{
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < str.length(); i++) 
		{
            char ch = str.charAt(i);

            if (output.indexOf(String.valueOf(ch)) == -1) 
			{
                output.append(ch);
            }
        }
        return output.toString();
    }
	
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
