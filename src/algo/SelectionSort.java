package algo;

public class SelectionSort {

    void sort(int[] a){
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int min = i;
            for (int j=i+1; j<n; j++){
                if (a[min] > a[j])
                    min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {5, -11, 64,25,12,22,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
