package DataStructuresAndAlgotithm.Sorting;



public class InsertionSort {
    public static void insertionSort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=key;
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
        insertionSort(arr);
        printArray(arr);
    }
}
