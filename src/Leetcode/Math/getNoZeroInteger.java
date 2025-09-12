package Leetcode.Math;
import java.util.*;
class solution
{
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++)
        {
            int b=n-a;
            if(isNoZero(a) && isNoZero(b))
            {
                return new int[]{a,b};

            }
        }
        return new int[]{};

    }
    private boolean isNoZero(int num)
    {
        while (num>0)
        {
            if(num%10==0)
            {
                return false;
            }
            num=num/10;
        }
        return true;
    }
}
public class getNoZeroInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        solution sol = new solution();
        int[] ans = sol.getNoZeroIntegers(n);


        System.out.println(ans[0] + " + " + ans[1] + " = " + n);


    }
}
