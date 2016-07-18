package org.string.ops;

import java.util.Scanner;

/**
 * Created by rbiswas on 2/6/2015.
 */
public class SearchPhrase {
    public static void main(String[] args) {
        String[] s = new String[3];
        Scanner kb = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.print("Please enter #" + (i + 1) + " string: ");
            s[i] = kb.nextLine();
            System.out.println();
        }
        String phrase;
        System.out.print("Please enter the string to search: ");
        phrase = kb.next();

        if (phrase.length() > 1) {
            for (String str : s) {
                if (str.toLowerCase().contains(phrase.toLowerCase()))
                    System.out.println(str + " is having phrase \'" + phrase + "\'");
            }
        }
    }
}
