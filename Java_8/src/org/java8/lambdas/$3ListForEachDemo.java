package org.java8.lambdas;

import java.util.*;

public class $3ListForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("raj"); list.add("deep"); list.add("biswas");

        /*
         * old way
         * problems:
         * Suppose, the list is synchronized. This means that every call to hasNext, next will be synchronized.
         * But what happens if another thread modified the collection between its method calls?
         * ConcurrentModificationException
         * This shows that the loop is controlled from outside of the list, hence external iteration.
         */
        for(String name: list){
            System.out.println(name);
        }

        /*
         * Java 8 - new API using FunctionalInterface
         * There's only one method call, this is internal iteration.
         * No ConcurrentModificationException can occur.
         */
        list.forEach(name -> System.out.println(name));
    }
}
