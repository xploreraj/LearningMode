package arrays;

import java.util.Arrays;

/**
 * Given an array of integers, write a program to output an another integer array
 * of equal length such that the element at index 'i' in the output array is the sum of
 * all elements in the input array except for the element at 'i'.
 */
public class TransformIntArray {
    public static int[] transform(int...args) {
        int n = args.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    temp[i] = temp[i] + args[j];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,7};
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Modified: " + Arrays.toString(transform(arr)));
    }
}
