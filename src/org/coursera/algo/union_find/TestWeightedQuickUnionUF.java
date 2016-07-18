package org.coursera.algo.union_find;

import java.util.Scanner;

/**
 * Created by rbiswas on 7/7/2014.
 */
public class TestWeightedQuickUnionUF {
    public static void main(String[] args) {
        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(10);

        Scanner kb = new Scanner(System.in);

        do {
            System.out.println("Option 1: Check connected, Option 2: Perform Union, Option 3: Exit");
            int choice = kb.nextInt();
            int temp1, temp2;
            switch (choice) {
                case 1:
                    System.out.println("Enter two values 1-10 to check connected");
                    temp1 = kb.nextInt();
                    temp2 = kb.nextInt();
                    System.out.println(weightedQuickUnionUF.connected(temp1, temp2));
                    break;
                case 2:
                    System.out.println("Enter two values 1-10 to perform union");
                    temp1 = kb.nextInt();
                    temp2 = kb.nextInt();
                    weightedQuickUnionUF.union(temp1, temp2);
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}
