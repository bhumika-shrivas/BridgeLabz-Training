import java.util.*;

public class CompareTwoStrings{
	
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
		
		System.out.println("Enter string 2: ");
		String str2 = input.next();
		
		boolean charAtResult = compareStrings(str1, str2);
		
		boolean equalsMethodResult = str1.equals(str2);
		
		System.out.println("Result using charAt() method : " +charAtResult);
		System.out.println("Result using equals() method : " +equalsMethodResult);
		
		if(charAtResult == equalsMethodResult){
		    System.out.println("Both method shows same result");
		}else{
		    System.out.println("Results are not same");
		}
		
		input.close();
	}
}
	
 