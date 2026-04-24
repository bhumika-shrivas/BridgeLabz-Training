import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ages
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Heights
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = input.nextInt();

        // Find youngest
        if (amarAge <= akbarAge && amarAge <= anthonyAge) 
		{
            System.out.println("Youngest friend is Amar");
        } 
		else if (akbarAge <= amarAge && akbarAge <= anthonyAge) 
		{
            System.out.println("Youngest friend is Akbar");
        }
		else 
		{
            System.out.println("Youngest friend is Anthony");
        }

        // Find tallest
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) 
		{
            System.out.println("Tallest friend is Amar");
        } 
		else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) 
		{
            System.out.println("Tallest friend is Akbar");
        } 
		else 
		{
            System.out.println("Tallest friend is Anthony");
        }

        input.close();
    }
}
