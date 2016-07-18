package org.algorithms.sorting;

import java.util.Arrays;

/**
 * Created by rbiswas on 2/1/2015.
 * Bubble sorting sorts the array in-place taking the largest value
 * Complexity is : O(n^2)
 */
public class BubbleSortDemo {

    public static void doBubbleSort(int[] args) {
        boolean swapped;
        int n = args.length;
        do {
            swapped = false;
            for (int i=1; i<n; i++) {
                if (args[i - 1] > args[i]) {
                    int temp = args[i - 1];
                    args[i - 1] = args[i];
                    args[i] = temp;
                    swapped = true;
                }
            }//for
            n--;
        } while(swapped);
    }

    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1,6};
        System.out.println("Original: " + Arrays.toString(numbers));
        doBubbleSort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }

}
