package DataStructuresAndAlgotithm.Math;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if(num<=1)return false;

        int sum=1;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                sum+=i;

                int otherdivisor=num/i;
                if(otherdivisor!=i)
                {
                    sum+=otherdivisor;
                }
            }
        }
        return sum==num;
    }
}
