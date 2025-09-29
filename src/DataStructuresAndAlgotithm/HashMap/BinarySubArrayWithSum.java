package DataStructuresAndAlgotithm.HashMap;
// leetcode 930
import java.util.HashMap;

public class BinarySubArrayWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>(); // hashmap to store frequency
        int count = 0;
        int sum = 0;
        map.put(0, 1); // base case

        for (int num : nums) {
            sum += num;
            // check if sum-goal has been seen before
            if (map.containsKey(sum - goal)) {
                count += map.get(sum - goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        BinarySubArrayWithSum obj = new BinarySubArrayWithSum();

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = obj.numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays with sum " + goal + " is: " + result);
    }
}
