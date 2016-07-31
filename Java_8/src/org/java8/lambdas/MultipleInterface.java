package org.java8.lambdas;

import java.util.TreeSet;

/**
 * Sometimes you may want to have a lambda expression implementing more than one interface.
 * This is mostly useful with marker interfaces (such as java.io.Serializable)
 * since they don't add abstract methods.
 */
public class MultipleInterface {
    public static void main(String[] args) {
        TreeSet<Long> ts = new TreeSet<>((x, y) -> Long.compare(y, x));
        ///TreeSet<Long> ts2 = new TreeSet<>((Comparator<Long>, Serializable) ((x,y) -> Long.compare(y,x)));
    }
}
