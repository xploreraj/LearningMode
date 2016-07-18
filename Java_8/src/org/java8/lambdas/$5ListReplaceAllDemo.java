package org.java8.lambdas;

import java.util.*;

public class $5ListReplaceAllDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Raj"); list.add("Deep"); list.add("Biswas");
        System.out.println(list);

        //to replace items, we have to get iterator
        for(ListIterator<String> iter = list.listIterator(); iter.hasNext(); ) {
            iter.set(iter.next().toLowerCase());
        }
        System.out.println(list);

        /*
         * Java 8 - new API using FunctionalInterface
         */
        list.replaceAll(name -> name.toUpperCase());
        System.out.println(list);
    }
}
