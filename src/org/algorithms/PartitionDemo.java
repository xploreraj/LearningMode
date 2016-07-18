package org.algorithms;

/**
 * Created by rbiswas on 1/31/2015.
 */
public class PartitionDemo {
    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1};
        partition(numbers,0,numbers.length-1);
    }

    private static void partition(int[] numbers, int low, int high) {
        int pivotElem = numbers[(low+high)/2];
        int i=low,j=high;
        while(i<j){
            if (numbers[i] < pivotElem)
                i++;
            if (numbers[j] > pivotElem)
                j--;

        }
    }
}
