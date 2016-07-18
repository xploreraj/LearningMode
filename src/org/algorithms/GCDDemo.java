package org.algorithms;

/**
 * Created by rbiswas on 7/17/2014.
 * Find the greatest common divisor (GCD) or the highest common factor (HCF)
 * of two positive integers.
 * Formal description of the Euclidean algorithm
 * Input Two positive integers, a and b.
 * Output The greatest common divisor, g, of a and b.
 * Internal computation
 * If a<b, exchange a and b.
 * Divide a by b and get the remainder, r. If r=0, report b as the GCD of a and b.
 * Replace a by b and replace b by r. Return to the previous step.
 */
public class GCDDemo {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 24;

        int a = num1, b = num2;

        if (a != b) {
            //swap if needed
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }

            int remainder;
            while((remainder = a%b) != 0) {
                a = b;
                b = remainder;
            }
        }
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + b);

    }
}
