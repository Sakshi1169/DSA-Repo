package DataStructuresAndAlgotithm.Binary_Search;
//leetcode 1170
/*
You are given an array nums where each element represents the number of balls in a bag. You can perform at most
 maxOperations splits, where each split divides a bag into two bags with positive balls.
The penalty is the maximum number of balls in any bag. Your goal is to minimize this penalty after performing at
 most maxOperations operations.
 */

public class MinLimitofBallsinBag {
    private boolean isPossible(int[] nums, int maxOperations,int penalty)
    {
        long operations=0;
        for(int num:nums)
        {
            operations+=(num-1)/penalty;
        }
        return operations<=maxOperations;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1;
        int high=0;
        for(int num:nums)
        {
            high=Math.max(high,num);
        }
        int ans=high;
        while (low<=high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(nums,maxOperations,mid))
            {
                ans=mid;
                high=mid-1;

            }
            else
            {
                low=mid+1;
            }

        }
        return ans;
    }
}

/*
Total Time Complexity: O(nlog(max(nums)))
space complexity : O(1)

Approach (Short)
Use **Binary Search on the penalty (maximum balls in a bag)**.

1. Search range: `1` to `max(nums)`.
2. For a guessed penalty `mid`, calculate total operations needed using:
   [
   (num - 1) / mid
   ]
3. If required operations ≤ `maxOperations`, try smaller penalty;
   otherwise increase penalty.

The smallest valid penalty found is the answer.

 */