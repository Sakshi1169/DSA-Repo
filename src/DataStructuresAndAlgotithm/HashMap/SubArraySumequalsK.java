package DataStructuresAndAlgotithm.HashMap;
//leetcode 560
import java.util.HashMap;

public class SubArraySumequalsK {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1); // base case: sum = 0 has frequency 1
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // running sum
            answer += map.getOrDefault(sum - k, 0); // add number of subarrays ending here with sum k
            map.put(sum, map.getOrDefault(sum, 0) + 1); // update frequency of sum
        }

        return answer;
    }

    public static void main(String[] args) {
        SubArraySumequalsK obj = new SubArraySumequalsK();

        int[] nums = {1, 2, 3, 0, 3};
        int k = 3;

        int result = obj.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + " is: " + result);
    }
}
