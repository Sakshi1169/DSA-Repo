package DataStructuresAndAlgotithm.Binary_Search;

// Modified Binary Search in Rotated Sorted Array
//leetcode 33
class Solution1 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            // Left part sorted
            else if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            // Right part sorted
            else {
                if (nums[mid] <= target && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

public class Search_InRoatedArr {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int target1 = 0;

        System.out.println("Index of " + target1 + " = " + sol.search(nums, target1));
    }
}
