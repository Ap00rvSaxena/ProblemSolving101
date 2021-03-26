package algo;

public class BubbleSort {
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5, -11, 22, 64,25,12,22,11};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    private void bubbleSort(int[] a) {
        int n = a.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (a[j] >= a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
