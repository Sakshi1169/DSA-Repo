package DataStructuresAndAlgotithm.Array;

public class LargestElementinArray {

    /*
      Problem:Given an integer array, find and return the largest (maximum) element.

     Solution-e iterate through the array and keep updating the maximum element whenever we find a larger value.
     * Time Complexity: O(n) — We scan every element once.
     * Space Complexity:O(1) — No extra space used.
     */

    public static int largestElement(int[] nums) {
        int max = nums[0]; // assume first element is max

        for (int i = 1; i < nums.length; i++) { // start from index 1
            if (nums[i] > max) {
                max = nums[i]; // update max
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 3, 2};
        int ans = largestElement(arr); // calling static method correctly
        System.out.println("Largest element is: " + ans);
    }
}