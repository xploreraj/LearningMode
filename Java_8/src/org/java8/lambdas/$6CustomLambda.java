package org.java8.lambdas;

import java.util.Collections;
import java.util.HashMap;

/**
 * Created by rbiswas on 16-07-2016.
 */
public class $6CustomLambda {
    public static void main(String[] args) {

        TwoArgInterface plusOperation = (a, b) -> a + b;
        TwoArgInterface divideOperation = (a,b)->{
            if (b==0) throw new IllegalArgumentException("Divisor can not be 0");
            return a/b;
        };

        System.out.println("Plus operation of 3 and 5 is: " + plusOperation.operate(3, 5));
        System.out.println("Divide operation 50 by 25 is: " + divideOperation.operate(50, 25));

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1000);
        map.put(2,3000);
        System.out.println(Collections.max(map.entrySet(), (entry1, entry2)->entry1.getValue()-entry2.getValue()).getKey());
    }
}

//@FunctionalInterface
interface TwoArgInterface {
    int operate(int a, int b);
}
