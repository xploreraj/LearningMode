package org.algorithms.sorting;

import java.util.Arrays;

/**
 * O(nlogn)
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9,7,3,1,3};
        System.out.println("original:" + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted:" + Arrays.toString(arr));
    }
    static void mergeSort(int[] arr) {

        int n = arr.length;
        if (n < 2) return; //base condition for recursion exit

        //divide the array into sub-arrays
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i=0; i<mid; i++)
            left[i] = arr[i];

        for (int i=mid; i<n; i++)
            right[i-mid] = arr[i];

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    static void merge(int[] left, int[] right, int[] arr) {
        int nLeft = left.length, nRight = right.length;
        int i=0, j=0, k=0;

        //compare left and right and replace in main arr in sorted order
        while (i < nLeft && j < nRight) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++; k++;
            }
            else {
                arr[k] = right[j];
                j++; k++;
            }
        }

        //either left or right could have been smaller above,
        //so once the smaller one extinguishes, insert the larger elements
        //from remaining bigger sub-array
        while (i < nLeft) {
            arr[k++] = left[i++];
        }

        while (j < nRight) {
            arr[k++] = right[j++];
        }
    }
}
