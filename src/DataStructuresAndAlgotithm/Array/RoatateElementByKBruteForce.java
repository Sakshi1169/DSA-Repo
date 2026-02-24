package DataStructuresAndAlgotithm.Array;

import java.sql.Time;
//roatate element by k positions - brute force approch
//Time Complexity = O(n × k)
public class RoatateElementByKBruteForce {
    public static void roatate(int arr[],int k)
    {
        int n=arr.length;
        k=k%n; //if k>n
        for(int i=0;i<k;i++)
        {
            int last=arr[n-1];
            for(int j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        roatate(arr,k);
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
}
