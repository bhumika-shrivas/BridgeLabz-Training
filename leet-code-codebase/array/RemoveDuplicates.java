import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates 
{

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int index = 1; // position for next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // k = number of unique elements
    }

    // Main method for local testing
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sorted array:");
        int[] nums = Arrays.stream(input.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        int k = removeDuplicates(nums);

        System.out.println("Output (k): " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
