package org.algorithms.sorting;

import java.util.Arrays;

/**
 * Created by rbiswas on 2/5/2015.
 */
public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] numbers = {7,5,4,1,2,3};
        System.out.println("Original: " + Arrays.toString(numbers));

        int minIndex;
        if (numbers.length > 1)
            for(int i = 0; i < numbers.length-1; i++) {
                minIndex = i; //just to start with
                //work out to find minimum index
                for (int j = i+1; j < numbers.length; j++)
                    if (numbers[j] < numbers[minIndex])
                        minIndex = j;
                //Do we have a min value Index that is different from what we set initially?
                if (minIndex != i){
                    //swap
                    int temp = numbers[minIndex];
                    numbers[minIndex] = numbers[i];
                    numbers[i] = temp;
                }
            }

        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}
