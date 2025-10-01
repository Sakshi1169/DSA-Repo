//leetcode 2956--> find intersection value beetween 2 arrays
package DataStructuresAndAlgotithm.HashMap;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class FindintersectionValue {

    // Method to find intersection values counts
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // Count of nums1 elements present in nums2
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) set2.add(num);
        int answer1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                answer1++;
            }
        }

        // Count of nums2 elements present in nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        int answer2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }

    // Main method to test the above method
    public static void main(String[] args) {
        FindintersectionValue finder = new FindintersectionValue();

        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 2, 3, 4};

        int[] result = finder.findIntersectionValues(nums1, nums2);

        System.out.println("Count of nums1 elements in nums2: " + result[0]);
        System.out.println("Count of nums2 elements in nums1: " + result[1]);
    }
}
