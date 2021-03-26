package algo;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSorting {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }*/
        int arr[] = {10, 9,8,7,6,5,4,3,2,1};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        QuickSorting ob =new QuickSorting();
        System.out.println("Unsorted Array: ");
        printArray(arr);
        ob.quicksort(arr, 0, n-1);
        System.out.println("Sorted Array: ");
        printArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    private  void quicksort(int[] arr, int l, int r) {
        if (l<r){
            int pivot = arr[(l+r) / 2];
            int index = partition(arr, l, r, pivot);

            quicksort(arr,l, index-1);
            quicksort(arr,index, r);
        }
    }

    private static int partition(int[] arr, int l, int r, int pivot) {
        while (l<=r){
            while(arr[l] < pivot)
                l++;
            while (arr[r] > pivot)
                r--;
            if (l<=r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return l;
    }
}
