import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {

        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }

    // Method to find the tallest friend
    public static int findTallest(double[] heights) {

        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println("\nYoungest friend is: " + names[youngestIndex]
                + " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend is: " + names[tallestIndex]
                + " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}
