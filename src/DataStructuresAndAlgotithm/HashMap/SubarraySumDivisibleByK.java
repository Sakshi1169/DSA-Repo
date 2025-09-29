package DataStructuresAndAlgotithm.HashMap;
// leetcode 974
import java.util.HashMap;

public class SubarraySumDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        int answer = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        m.put(0, 1); // base case

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;
            if (sum < 0) sum += k; // handle negative modulo

            answer += m.getOrDefault(sum, 0); // add count of previous prefix sums with same remainder
            m.put(sum, m.getOrDefault(sum, 0) + 1); // update frequency
        }

        return answer;
    }

    public static void main(String[] args) {
        SubarraySumDivisibleByK obj = new SubarraySumDivisibleByK();

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int result = obj.subarraysDivByK(nums, k);
        System.out.println("Number of subarrays divisible by " + k + " is: " + result);
    }
}
