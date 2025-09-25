package DataStructuresAndAlgotithm.Binary_Search;
//leetcode 1760
import java.util.Arrays;

public class MinimumLimitofBalls {

    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for (int num : nums) {
            right = Math.max(num, right);
        }
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(nums, maxOperations, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private boolean isPossible(int[] nums, int maxOperations, int target) {
        long operations = 0; // long to avoid overflow
        for (int num : nums) {
            if (num > target) {
                operations += (num - 1L) / target;
            }
        }
        return operations <= maxOperations;
    }

    // Main method to test the code
    public static void main(String[] args) {
        MinimumLimitofBalls solution = new MinimumLimitofBalls();

        // Test case 1
        int[] nums1 = {9};
        int maxOperations1 = 2;
        System.out.println("Minimum penalty: " + solution.minimumSize(nums1, maxOperations1));
        // Expected output: 3

        // Test case 2
        int[] nums2 = {2, 4, 8, 2};
        int maxOperations2 = 4;
        System.out.println("Minimum penalty: " + solution.minimumSize(nums2, maxOperations2));
        // Expected output: 2

        // Test case 3 (large numbers)
        int[] nums3 = {1000000000, 1000000000, 1000000000};
        int maxOperations3 = 1000000000;
        System.out.println("Minimum penalty: " + solution.minimumSize(nums3, maxOperations3));
        // Expected output: 3
    }
}
