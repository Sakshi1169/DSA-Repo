package DataStructuresAndAlgotithm.Math;
//leetcode 172
public class FactorialTrailingZero {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0)
        {
            n=n/5;
            count+=n;
        }
        return count;
    }
}




/*
time	-O(log n)
Space	 -O(1)
 */