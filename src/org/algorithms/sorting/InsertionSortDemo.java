package org.algorithms.sorting;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1,4};
        System.out.println(Arrays.toString(numbers));
        if (numbers.length > 1)
            /*for (int i=1; i<numbers.length; i++) {
                //The 'i' is the partition, left of which is sorted array
                //and insertIndex got the element that has to be inserted in proper place in sorted array
                int insertIndex = i;
                int insertValue = numbers[i];
                while (insertIndex>0 && numbers[insertIndex-1]>insertValue) {
                    numbers[insertIndex] = numbers[insertIndex-1];
                    insertIndex--;
                }
                numbers[insertIndex] = insertValue;
                System.out.println(Arrays.toString(numbers));
            }*/

            doInsertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void doInsertionSort(int[] input){
        for (int i = 1; i < input.length; i++) {
            int j = i;
            //does not runs for sorted array, leaving best case to O(n)
            while (j>0 && input[j-1] > input[j]) {
                swap(input, j, j - 1);
                j--;
            }
            //O(n^2) even for sorted array
            /*for(int j = i ; j > 0 ; j--) {
                System.out.println("ran ");
                if(input[j] < input[j-1])
                    swap(input,j,j-1);
                    }*/
        }
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
