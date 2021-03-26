package algo;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args){
        int[] arr = {10, 9,8,7,5,5,4,3,1,1};
        int n = arr.length;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        CountingSort cs = new CountingSort();
        cs.sort(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private void sort(int[] arr, int n) {
        int[] freq = new int[100];
        for (int i=0; i<n; i++){
            freq[arr[i]] += 1;
        }
        //int[] sumFreq = new int[n];
        for (int i=1; i<freq.length; i++){
            freq[i] += freq[i-1];
        }
        int[] output = new int[n];
        for (int i=0; i<n; i++) {
            output[freq[arr[i]] - 1] = arr[i];
            freq[arr[i]]--;
        }
        for (int i=0; i<n; i++) {
            arr[i] = output[i];
        }
        ///System.out.println("Sorted Array: " + Arrays.toString(output));
        //return output;
    }
}
