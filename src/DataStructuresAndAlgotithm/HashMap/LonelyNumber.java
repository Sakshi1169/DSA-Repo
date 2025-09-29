package DataStructuresAndAlgotithm.HashMap;
//leetcode 2150
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyNumber {

    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Count frequency of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check for lonely numbers
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 1 && !freqMap.containsKey(num - 1) && !freqMap.containsKey(num + 1)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LonelyNumber obj = new LonelyNumber();

        int[] nums = {10, 6, 5, 8, 9};
        List<Integer> lonelyNumbers = obj.findLonely(nums);

        System.out.println("Lonely numbers are: " + lonelyNumbers);
    }
}
