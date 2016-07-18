package org.java8.lambdas;

import java.util.*;

public class $4ListRemoveIfDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ram",10));
        list.add(new Person("Sam",9));
        list.add(new Person("Jacky",12));
        list.add(new Person("Abram",12));
        System.out.println(list);

        //to remove items, we have to get iterator
        for(Iterator<Person> iter = list.iterator(); iter.hasNext(); ) {
            Person p = iter.next();
            if ("Jacky".equals(p.getName()))
                iter.remove();
        }

        System.out.println(list);

        /*
         * Java 8 - new API using FunctionalInterface
         */
        list.removeIf(p -> "Abram".equals(p.getName()));
        System.out.println(list);
    }
}
