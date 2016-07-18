package justlikethat;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingBrackets {

    private static final Set<Character> OPENING_BRACKETS = new HashSet<>(Arrays.asList(new Character[]{'[', '{', '<', '('}));
    private static final Set<Character> CLOSING_BRACKETS = new HashSet<>(Arrays.asList(new Character[]{']', '}', '>', ')'}));
    private static final Map<Character, Character> map = new HashMap<>(4);
    static {
        map.put('[',']');
        map.put('<','>');
        map.put('{','}');
        map.put('(',')');
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = kb.nextInt();
        while(n-- > 0) {
            System.out.println("Enter brackets expression:");
            kb.nextLine();
            String exp = kb.next();
            System.out.println(isExpValid(exp));
        }
    }

    static String isExpValid(String exp) {
        char[] inputBrackets = exp.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch : inputBrackets) {
            if(OPENING_BRACKETS.contains(ch))
                stack.push(ch);
            else if (CLOSING_BRACKETS.contains(ch))
                if(stack.isEmpty() || map.get(stack.pop())!=ch)
                    return "NO";
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}