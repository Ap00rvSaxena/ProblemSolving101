import java.util.PriorityQueue;

public class MergeKsortedArray {
    // Driver code
    public static void main(String args[]){
        int[][] arr= {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};

        System.out.println("Merged array is :");

        mergeKSortedArrays(arr,arr.length);
    }

    private static void mergeKSortedArrays(int[][] arr, int k) {
        int n = arr[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] res = new int[n*k];
        int indx=0;
        boolean[] chosen = new boolean[k];
        for (int i=0; i<n; i++){
            int j = 0;
            int m =i;
            while(pq.size() != k){
                pq.add(arr[j][k]);
                j = (j+1)%k;
            }
            res[indx++] = pq.poll();
            chosen[j] = true;
        }
    }
}
