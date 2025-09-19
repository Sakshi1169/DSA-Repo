package Leetcode.Binary_Search;

public class BinarySearchDemo {
    public int search(int[] nums, int target) {
        int start=0;
        int n=nums.length;
        int end=n-1;

        //binary search
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                return mid;

            }
            else if(nums[mid]<target)
            {
                start=mid=1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
