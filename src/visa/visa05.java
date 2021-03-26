package visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class visa05{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int[] a = {1, 2, 2,2, 3 ,4 ,5 ,3};
        for(int i=0; i<a.length; i++){
            numbers.add(a[i]);
        }
        findMinOp(numbers);
    }

    private static void findMinOp(List<Integer> num) {
        int n = num.size();
        long count = 0;
        List<Integer> arr = new ArrayList<>();
        for (Integer i : num){
            long temp = getCount(arr, i);
            arr.add(i);
            Collections.sort(arr);
            System.out.print("\nTemp: "+temp + " Inserting: " + i +" -> " +arr.toString());
            count = count + temp;
        }
        System.out.println("\n"+ count);
    }

    private static long getCount(List<Integer> arr, int i) {
        if (arr.size() < 2)
            return 1;
        if (arr.get(0) >= i || arr.get(arr.size()-1) <= i)
            return  1;
        long indx = Collections.binarySearch(arr, i);
        if (indx < 0){
            indx = (indx*-1) -1;
            System.out.println(" indx: " +  indx + " Size-Indx: " + (arr.size()-indx));
            return (Math.min(indx,(arr.size()-indx))*2 +1);
        }
        else {
            //long min = Long.MAX_VALUE;
            long left = 0, right=0;
            long j = indx-1;
            while (arr.get((int) j) == arr.get((int) indx) && j >= 0){
                j--;
                left++;
            }
            j = indx +1;
            while (arr.get((int) j) == arr.get((int) indx) && j < arr.size()){
                j++;
                right++;
            }
            left = indx -left;
            right = indx + right +1;
            System.out.println(" index: "+ indx +" left: " + left + " right: " + right);
            left = Math.min(left, arr.size() - left);
            right = Math.min(right, arr.size() - right);
            System.out.println(" After index: "+ indx +" left: " + left + " right: " + right);
            return Math.min(left, right)*2 +1;
        }
    }
}
