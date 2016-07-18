package org.algorithms.sorting;

import java.util.Arrays;

public class QuickSortDemo {

    public static void main(String...args){
        int[] arr = {4,5,3,2,1,7};
        System.out.println("initial array:"+ Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("\nfinal array:"+Arrays.toString(arr));
    }

    /**
     * Applies the quicksort
     * @param arr The array to be sorted
     * @param start Starting index for sorting
     * @param end End index for sorting
     */
    private static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pIndex = partition(arr,start, end);
            quickSort(arr, start, pIndex-1);
            quickSort(arr, pIndex+1, end);
        }
    }

    /**
     * Push all elements lesser than or equal pivot to left
     * of partition index, and finally, replace pivot with
     * element at partition index, so that we have the sub-array
     * from partition index towards left sorted in ascending fashion.
     * @param start index
     * @param end index
     * @return partition index
     */
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];   //pivot, last element here
        int pIndex = start;       //partition index
        for(int i = start; i<= (end-1); i++)
            if(arr[i] < pivot) {
                swap(arr, i,pIndex);
                pIndex++;
            }
        //now that all elements left to pIndex are lesser
        // than pivot (which is at end until now),
        //swap the pIndex element and pivot, so that
        // the pivot is in correct place now
        swap(arr, pIndex, end);
        return pIndex;
    }

    /**
     * Swaps the elements in the 'arr' array on specified indices
     * @param index1
     * @param index2
     */
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}