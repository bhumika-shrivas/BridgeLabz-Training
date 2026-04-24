import java.util.*;

public class CreateSubstring{
	
	// Find substring
	public static String createSubstring(String str1 , int start , int end){
	    
		String result = "";

        for (int i = start; i < end; i++) {
            result = result + str1.charAt(i);
        }

        return result;
	}
	
	// Compare two strings 
	public static boolean compareStrings(String s1 , String s2){
	    
		//Check if strings are equal
		if (s1.length() != s2.length()) {
            return false;
        }
		
		for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
		
		return true;
	}
	
	public static void main(String[] args){
	
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string 1: ");
		String str1 = input.next();
		
		System.out.println("Enter start index: ");
		int start = input.nextInt();
		
		System.out.println("Enter end index: ");
		int end = input.nextInt();
		
		String subStringUsingCharAt = createSubstring(str1,start,end);
		
		String subStringBuiltIn = str1.substring(start, end);
		
		boolean comparedString = compareStrings(subStringUsingCharAt, subStringBuiltIn);

		
		System.out.println("Substring using substring() method : " +subStringBuiltIn);
		System.out.println("Substring using charAt() method : " +subStringUsingCharAt);
		System.out.println("Are both substrings equal? " + comparedString);
		
		input.close();
	
	}
}
	
 