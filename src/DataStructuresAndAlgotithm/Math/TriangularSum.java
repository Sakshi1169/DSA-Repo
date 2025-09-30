package DataStructuresAndAlgotithm.Math;
//leetcode 2221
public class TriangularSum {

    // Function to calculate triangular sum of an array
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; // if array has only 1 element, return it

        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10; // sum of adjacent elements modulo 10
            }
            n--; // reduce the size of array for next iteration
        }
        return nums[0]; // final single element is the triangular sum
    }

    // Main method to test the function
    public static void main(String[] args) {
        TriangularSum ts = new TriangularSum();
        int[] nums = {2, 5, 3, 7};
        int result = ts.triangularSum(nums);
        System.out.println("Triangular Sum: " + result);
    }
}
