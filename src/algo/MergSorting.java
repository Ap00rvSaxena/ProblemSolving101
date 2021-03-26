package algo;

import java.util.Arrays;

public class MergSorting {
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        MergSorting ms = new MergSorting();
        ms.mergsort(arr, 0, n-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private void mergsort(int[] arr, int left, int right) {
        if(left<right){
            int mid = left + (right-left)/2;
            mergsort(arr, left, mid);
            mergsort(arr, mid+1, right);
            merg(arr, left, mid, right);
        }
    }

    private void merg(int[] arr, int left, int mid, int right) {
        int lsize = mid -left +1;
        int rsize = right - mid;
        int[] leftarr = new int[lsize];
        int[] rightarr = new int[rsize];

        for(int i=0; i<leftarr.length; i++){
            leftarr[i] = arr[left+i];
        }
        for(int i=0; i<rightarr.length; i++){
            rightarr[i] = arr[mid+i+1];
        }

        int i=0, j=0, k=left;
        while (i<lsize && j<rsize){
            if(leftarr[i] < rightarr[j]){
                arr[k] = leftarr[i];
                i++;
            }
            else{
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }
        while (i<lsize){
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j<rsize){
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }
}
