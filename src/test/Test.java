package test;

import java.util.Stack;

public class Test{

   public static void main(String[] args) {
       getNGE(new int[] {40,50,11,32,55,68,75});
   }

    public static void getNGE(int[] a) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(a[0]);

        for (int i = 1; i < a.length; i++) {
            if (s.peek() != null) {
                while (true) {
                    if (s.peek() == null || s.peek() > a[i]) {
                        break;
                    }
                    System.out.println(s.pop() + ":" + a[i]);
                }
            }
            s.push(a[i]);
        }
        while (s.peek() != null) {
            System.out.println(s.pop() + ":" + -1);
        }
    }
}