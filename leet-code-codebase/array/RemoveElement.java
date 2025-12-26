import java.util.Scanner;
import java.util.Arrays;

public class RemoveElement {

    // LeetCode-style method
    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i]; // modify in-place
                index++;
            }
        }
        return index;
    }

    // Main method for local testing
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array:");
        int[] nums = Arrays.stream(input.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        System.out.print("Enter the value to remove: ");
        int val = input.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Output (new length): " + k);
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
