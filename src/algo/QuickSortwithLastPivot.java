package algo;

import java.util.Arrays;

public class QuickSortwithLastPivot {
    public static void main(String[] args){
        int[] arr = {10, 9,8,7,5,5,4,3,1,1};
        int n = arr.length;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        QuickSortwithLastPivot qs = new QuickSortwithLastPivot();
        qs.quickSort(arr, 0, n-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int left, int right) {
        if(left<right){
            int pivot = arr[right];
            int indx = partition(arr, left, right);
            quickSort(arr,left,indx-1);
            quickSort(arr,indx+1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int i=left-1;
        int pivot = arr[right];
        for(int j=left; j<right; j++){
            if(arr[j] < pivot){
                i++;
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }
}
