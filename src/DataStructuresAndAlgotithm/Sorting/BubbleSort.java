package DataStructuresAndAlgotithm.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            boolean isSwapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }

            }
            if(!isSwapped)break;
        }

    }

    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
