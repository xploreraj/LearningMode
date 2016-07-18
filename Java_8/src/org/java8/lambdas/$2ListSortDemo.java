package org.java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class $2ListSortDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ram",10));
        list.add(new Person("Sam",9));
        list.add(new Person("Jacky",12));
        list.add(new Person("Abram",12));
        System.out.println(list);

        //Sort using comparator
        Comparator nameComparator = new Comparator<Person>(){
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Collections.sort(list, nameComparator);
        System.out.println(list);


        /*
         * Java 8 - sort() is default interface method, and here we are passing comparator
         * type is auto inferred.
         */
        Collections.sort(list,
                (p1, p2) -> p1.getAge()-p2.getAge() );
        System.out.println(list);

    }
}

class Person implements Cloneable {
    private String name;
    private int age;

    Person(String name, int age) {
        if((name == null || name.isEmpty())&& age < 1)
            throw new IllegalArgumentException("Name can't be empty or age can't be less than 1");
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return name+": "+age;
    }
}