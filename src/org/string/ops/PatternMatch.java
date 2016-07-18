package org.string.ops;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by rbiswas on 2/6/2015.
 */
public class PatternMatch {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        String s;
        System.out.println("Please enter data for pattern:");
        s = new Scanner(System.in).next();
        int x = Integer.parseInt(s.substring(0,1)),
                y = Integer.parseInt(s.substring(1,2));

        if(map.containsKey(x) && map.containsKey(y)) {
            String s1 = map.get(x);
            String s2 = map.get(y);
            System.out.println("First string is " + s1);
            System.out.println("Second string is " + s2);
            System.out.println("And patterns what you want is like below: ");
            for (int i=0; i<3; i++)
                for (int j=0; j<3; j++)
                    System.out.println(s1.charAt(i) + "" + s2.charAt(j));
        }
    }
}
