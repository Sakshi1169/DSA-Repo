package DataStructuresAndAlgotithm.Math;

import java.sql.Time;//gfg
class countNoofdigits {
    public int countDigits(int n) {
        if(n==0)return 1; //imp edgeCase
        n=Math.abs(n); //handles negative no
        int count=0;
        while(n>0)
        {
            n=n/10; //reduce number every time
            count++;
        }
        return count;
    }
}
/*Complexity
Time: O(number of digits)
Space: O(1)*/