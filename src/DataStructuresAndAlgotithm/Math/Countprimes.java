package DataStructuresAndAlgotithm.Math;
//leetcode 204
//Seive of erthothensis
public class Countprimes {
        final int N=5000000;
        boolean isPrime[]=new boolean[N];
        public int countPrimes(int n) {
            if(n<=2)return 0;
            for(int i=2;i<n;i++)
            {
                isPrime[i]=true;
            }

            //run till sqrt n
            for(int i=2;i*i<n;i++)
            {
                if(isPrime[i])
                {
                    for(int j=i*i;j<n;j+=i)
                    {
                        isPrime[j]=false;
                    }
                }
            }
            int cnt=0;
            for(int i=2;i<n;i++)
            {
                if(isPrime[i]==true)
                {
                    cnt++;
                }

            }
            return cnt;
        }
    }

    /*
Time Complexity	O(n log log n)
Space Complexity	O(n)
     */