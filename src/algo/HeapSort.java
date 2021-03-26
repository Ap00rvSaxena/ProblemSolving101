package algo;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args){
        int[] arr = {1,1,3,10, 9,8,7,5,5,4};
        int n = arr.length;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        HeapSort mh = new HeapSort();
        mh.heapsort(arr, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private void heapsort(int[] arr, int n) {
        for (int i=n/2 -1; i>=0; i--){
            heapify(arr,n,i);
        }

        for (int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if( left<n && arr[left] > arr[largest])
            largest =left;
        if( right<n && arr[right] > arr[largest])
            largest = right;

        if (largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }
}
