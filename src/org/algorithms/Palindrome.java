package org.algorithms;

/**
 * Created by rbiswas on 7/10/2014.
 */
public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int reverse = 0;
        while(temp>0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        System.out.println(num==reverse);
    }
}
