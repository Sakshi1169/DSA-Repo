package DataStructuresAndAlgotithm.Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            if(minIndex!=i)
            {
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

            }
        }

    }
    public static void printArray(int arr[])
    {
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={66,44,33,88,22,90};
        System.out.println("originl arr: ");
        printArray(arr);
        System.out.println("Array after sorting");
        selectionSort(arr);
        printArray(arr);
    }
}
