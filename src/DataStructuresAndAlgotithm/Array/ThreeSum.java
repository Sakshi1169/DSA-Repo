package DataStructuresAndAlgotithm.Array;
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            // Skip duplicates for i
            if(i >0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            int target=-nums[i];
            while(j<k)
            {
                if(nums[j]+nums[k]==target)
                {
                    List<Integer> currList=new ArrayList<>();
                    currList.add(nums[i]);
                    currList.add(nums[j]);
                    currList.add(nums[k]);
                    answer.add(new ArrayList<>(currList));
                    //skip duplicates for j
                    while(j<k && nums[j]==nums[j+1])j++;
                    //skip duplicates for k
                    while(j<k && nums[k]==nums[k-1])k--;

                    j++;
                    k--;

                }
                else if(nums[j]+nums[k]>target)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return answer;
    }
}
public class ThreeSum {
    public static void main(String[] args) {

    }
}
