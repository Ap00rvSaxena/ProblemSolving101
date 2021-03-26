package algo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6, 11};
        int n = arr.length;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        InsertionSort cs = new InsertionSort();
        cs.sort(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private void sort(int[] arr, int n) {
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
