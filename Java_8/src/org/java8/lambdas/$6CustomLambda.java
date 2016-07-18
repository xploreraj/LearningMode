package org.java8.lambdas;

/**
 * Created by rbiswas on 16-07-2016.
 */
public class $6CustomLambda {
    public static void main(String[] args) {

        TwoArgInterface plusOperation = (a, b) -> a + b;
        TwoArgInterface calculateArea = (a,b)->a*b;

        System.out.println("Plus operation of 3 and 5 is: " + plusOperation.operate(3, 5));
        System.out.println("Area of rectangle with edges 50 by 30 is: " + calculateArea.operate(50, 30));
    }
}

//@FunctionalInterface
interface TwoArgInterface {
    int operate(int a, int b);
}
