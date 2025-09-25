package DataStructuresAndAlgotithm.Binary_Search;

public class SplitArray {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;

        // Step-1: find max and sum
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }

        int left = max;
        int right = sum;
        int result = sum;

        // Step-2: Binary Search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    // Step-3: Greedy check
    private boolean canSplit(int[] nums, int k, int mid) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > mid) {
                count++;
                currentSum = num;

                if (count > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        return true;
    }

    // Main method to test
    public static void main(String[] args) {
        SplitArray solution = new SplitArray();

        int[] nums1 = {7, 2, 5, 10, 8};
        int k1 = 2;
        System.out.println("Output for Example 1: " + solution.splitArray(nums1, k1));
        // Expected: 18

        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        System.out.println("Output for Example 2: " + solution.splitArray(nums2, k2));
        // Expected: 9
    }
}
