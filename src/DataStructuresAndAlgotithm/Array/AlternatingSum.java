package DataStructuresAndAlgotithm.Array;

// Leetcode weekly contest 470 - Compute alternating Sum


public class AlternatingSum {
    public int alternatingSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {  // even index
                sum += nums[i];
            } else {           // odd index
                sum -= nums[i];
            }
        }
        return sum;
    }

    // main method for local testing
    public static void main(String[] args) {
        AlternatingSum obj = new AlternatingSum();

        int[] nums1 = {1, 3, 5, 7};
        System.out.println("Output for [1,3,5,7]: " + obj.alternatingSum(nums1)); // expected -4

        int[] nums2 = {100};
        System.out.println("Output for [100]: " + obj.alternatingSum(nums2)); // expected 100
    }
}
