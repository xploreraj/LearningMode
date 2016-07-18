package org.algorithms;

/**
 * Created by rbiswas on 7/11/2014.
 * This is ridiculously inefficient
 */
public class NextPalindrome {
    public static void main(String[] args) {
        long x = 1000110002L;
        // given number n. Assign it some value.
        long temp;    // variable for storing x temporarily;
        temp = x;
        long d = 0;     // variable for storing digits of n temporarily
        long reverse; // the variable which will eventually store the reversed
        // number n
        reverse = 0;
        boolean flag;
        flag = false;

        while (!flag) {
            long n = temp;
            reverse = 0;
            while (n > 0) {
                d = n % 10;
                reverse = reverse * 10 + d;
                n = n / 10;
            }
            flag = (reverse == temp);
            temp = temp + 1;
            System.out.println("temp is: " + temp);
        }
        System.out.println("the next palindrome of " + x + " is : " + reverse);
    }
}
