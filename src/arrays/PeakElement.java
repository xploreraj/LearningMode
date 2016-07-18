package arrays;

import java.util.TreeSet;

/**
 * Created by rbiswas on 3/18/2015.
 * Print the lowest peak of an array. A peak element is one whose adjacent elements on both sides
 * are lower than it.
 * For example, {2,1,2} has no peak. {2,3,1,4,5,3} has 3 as lowest peak and 5 as highest peak element.
 */
public class PeakElement {
    public static void printLowestPeak(int[] arr, int size) {
        Integer lowestPeak = null;
        boolean isPeak = false;
        TreeSet tree = new TreeSet();

        if(size < 3) {
            System.out.println("No peak found");
            return;
        }
        for(int i=1;i<size-1;i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
                lowestPeak = (lowestPeak == null) ? arr[i] : (arr[i] < lowestPeak ? arr[i] : lowestPeak);
        }

        if (lowestPeak==null)
            System.out.println("no peak found");
        else
            System.out.println(lowestPeak);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,6,2,3,5,4};

        printLowestPeak(arr1,arr1.length);
        printLowestPeak(arr2,arr2.length);
    }
}
