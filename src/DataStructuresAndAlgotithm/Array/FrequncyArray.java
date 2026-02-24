package DataStructuresAndAlgotithm.Array;
//frequency array
//time complexity-O(N)
public class FrequncyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1};

        int max =0;  // maximum possible value
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for(int i = 0; i <= max; i++) {
            if(freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }


    }
}
