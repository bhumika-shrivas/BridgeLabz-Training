import java.util.Scanner;
import java.util.Arrays;

public class SearchInsertPosition {

    // Function using Binary Search
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // left is the correct insert position
        return left;
    }

    // Main method for local testing
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sorted array:");
        int[] nums = Arrays.stream(input.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        System.out.print("Enter the target value: ");
        int target = input.nextInt();

        int result = searchInsert(nums, target);
        System.out.println("Output: " + result);
    }
}
