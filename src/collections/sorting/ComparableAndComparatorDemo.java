package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rbiswas on 6/7/2015.
 */

class Fruits implements Comparable<Fruits> {
    String name;
    int quantity;

    public Fruits(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //default comparison based on quantity
    public int compareTo(Fruits compareFruit) {
        return this.quantity - compareFruit.quantity;
    }

    public String toString(){
        return name + "- " + quantity;
    }
}

public class ComparableAndComparatorDemo {
    public static void main(String[] args) {
        Fruits guava = new Fruits("Guava",10);
        Fruits apple = new Fruits("Apple",5);
        Fruits pineapple = new Fruits("Pineapple",2);

        List<Fruits> fruits = new ArrayList<Fruits>();
        fruits.add(guava);
        fruits.add(pineapple);
        fruits.add(apple);

        System.out.print("Before sorting:                               ");
        System.out.println(fruits);

        //1. This uses default comparison, from Fruits class
        Collections.sort(fruits);

        System.out.print("After sorting with default implementation:    ");
        System.out.println(fruits);

        //2. Providing a comparator to override default comparison
        Comparator<Fruits> nameComparator = new Comparator<Fruits>() {
            @Override
            public int compare(Fruits f1, Fruits f2) {
                return f1.name.compareTo(f2.name);
            }
        };

        Collections.sort(fruits,nameComparator);

        System.out.print("After sorting using Comparator based on name: ");
        System.out.println(fruits);
    }
}
