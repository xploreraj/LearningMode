package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbiswas on 6/29/2015.
 */
public class Test {
    public static void main(String[] args) {
        List<? extends A> list = new ArrayList<>();

        String str1 = "hello".toString();
        String str2 = "hello".toString();
        System.out.println(str1==str2);
    }
}

class A {
    @Override
    public String toString() {
        return "A";
    }

    public void testGeneric(List<? extends A> list){

        //list.add(new B())
    }
}

class B extends A {
    @Override
    public String toString() {
        return "B";
    }
}