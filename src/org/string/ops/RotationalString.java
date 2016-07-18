package org.string.ops;

public class RotationalString {
    static boolean isRotational(String s1, String s2) {
        //String temp = s1.concat(s2);
        //return temp.contains(s2);
        return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
    }

    public static void main(String[] args) {
        System.out.println(isRotational("ABCD", "BCDA"));
    }
}
