package org.algorithms.DP;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rbiswas on 4/3/2015.
 */
public class LCS {
    public static void main(String[] args) {
        Character[] ch1 = {'a','c','e','r'};
        Character[] ch2 = {'c','r','o'};
        List list = longestCommonSubsequence(ch1,ch2);
        System.out.println(list.toString());

    }


    public static <E> List<E> longestCommonSubsequence(E[] s1, E[] s2)
    {
        int[][] num = new int[s1.length+1][s2.length+1];  //2D array, initialized to 0

        //Actual algorithm
        for (int i = 1; i <= s1.length; i++)
            for (int j = 1; j <= s2.length; j++)
                if (s1[i-1].equals(s2[j-1]))
                    num[i][j] = 1 + num[i-1][j-1];
                else
                    num[i][j] = Math.max(num[i-1][j], num[i][j-1]);

        System.out.println("length of LCS = " + num[s1.length][s2.length]);

        int s1position = s1.length, s2position = s2.length;
        List<E> result = new LinkedList<E>();

        while (s1position != 0 && s2position != 0)
        {
            if (s1[s1position - 1].equals(s2[s2position - 1]))
            {
                //System.out.println(s1position+"..."+s2position+"..."+s1[s1position-1]);
                result.add(s1[s1position - 1]);
                s1position--;
                s2position--;
            }
            else if (num[s1position][s2position - 1] >= num[s1position][s2position])
            {
                s2position--;
            }
            else
            {
                s1position--;
            }
        }
        Collections.reverse(result);
        return result;
    }
}