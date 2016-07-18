package justlikethat;

import java.util.Arrays;

/**
 * Created by rbiswas on 5/16/2015.
 */
public class Fibonacci {
    public static void main(String[] args) {
        //printFibonacciIterative(4);
        fiboRecur(5);
        System.out.println(Arrays.toString(fibArr));
    }

    static int[] fibArr = new int[5];
    static int fiboRecur(int n) {
        fibArr[0] = 0;
        fibArr[1] = 1;
        for(int i=2; i<n; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }
        return fibArr[n-1];
    }

    static void printFibonacciIterative(int n){
        if (n<1) throw new IllegalArgumentException("Must have a positive integer");
        if (n==1) {
            System.out.println("0");
            return;
        }
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 0; i < n-2; i++) {
            int sum = a+b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
        }
    }
}
