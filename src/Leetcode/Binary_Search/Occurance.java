package Leetcode.Binary_Search;
//leetcode -34
//binary search
import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = firstOccur(nums, target);
        result[1] = lastOccur(nums, target);
        return result;
    }

    private int firstOccur(int nums[], int target) {
        int start = 0, end = nums.length - 1;
        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                answer = mid;
                end = mid - 1; // search left side for first occurrence
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }

    private int lastOccur(int nums[], int target) {
        int start = 0, end = nums.length - 1;
        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                answer = mid;
                start = mid + 1; // search right side for last occurrence
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }
}

public class Occurance {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {5, 7, 7, 8, 8, 10}; // single input array
        int target = 8; // single target

        int[] result = sol.searchRange(nums, target);
        System.out.println("Target range: " + Arrays.toString(result));
    }
}
