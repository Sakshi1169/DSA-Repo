package Leetcode.Binary_Search;
//leetcode 153
class Answer {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the minimum element
            if (nums[(mid - 1 + n) % n] >= nums[mid] && nums[mid] <= nums[(mid + 1) % n]) {
                return nums[mid];
            }

            // If the subarray is already sorted, start is the minimum
            if (nums[start] <= nums[end]) {
                return nums[start];
            }

            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return nums[0]; // fallback
    }
}

public class MinimumInRotatedArr {
    public static void main(String[] args) {
        Answer solution = new Answer();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};


        System.out.println("Minimum in nums1: " + solution.findMin(nums1)); // 0

    }
}
