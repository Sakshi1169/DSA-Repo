package DataStructuresAndAlgotithm.Array;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maxSum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            int op1=nums[i];
            int op2=currentSum+nums[i];
            currentSum=Math.max(op1,op2);


            if(currentSum> maxSum)
            {
                maxSum=currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,-6,7,8};
        int res= maxSubArray(arr);
        System.out.println(res);

    }
}
