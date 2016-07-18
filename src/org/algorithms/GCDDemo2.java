package org.algorithms;

/**
 * Created by rbiswas on 7/17/2014.
 * inefficient
 */
public class GCDDemo2 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        int small = num1;
        int big = num2;
        int temp;

        if(small > big) {
            temp = small;
            small = big;
            big = temp;
        }

        while (small != big) {
            temp = big - small;
            if (temp < small) {
                big = small;
                small = temp;
            }
            else
                big = temp;
        }

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + small);
    }
}
