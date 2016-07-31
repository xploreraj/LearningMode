package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/crush
 * You are given a list of size N, initialized with zeroes. You have to perform M operations on the list and output the maximum of
 * final values of all the N elements in the list. For every operation, you are given three integers ,
 * and  and you have to add value K to all the elements ranging from index a to b(both inclusive).
 * Input Format
 * First line will contain two integers N and M separated by a single space.
 * Next  lines will contain three integers a, b and k separated by a single space.
 * Numbers in list are numbered from 1 to N.
 * Output Format
 * A single line containing maximum value in the updated list.
 * Sample Input #00
 * 5 3
 * 1 2 100
 * 2 5 100
 * 3 4 100
 * Sample Output #00
 * 200
 */

public class MOpsListMaxValue {
    private Scanner scanner;

    public static void main(String[] args) {
        MOpsListMaxValue solution = new MOpsListMaxValue();

        long max = solution.solve();
        System.out.println(max);
    }

    public long solve() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        long[] start = new long[n];
        long[] end = new long[n];


        while (m-- > 0) {
            kb.nextLine();
            int a = kb.nextInt();
            int b = kb.nextInt();
            long k = kb.nextLong();

            start[a] += k;
            end[b] += k;
        }

        long sum = 0L;
        long max = -1L;

        for (int i = 1; i < n + 1; i++) {
            sum += start[i];

            if (sum > max) {
                max = sum;
            }

            sum -= end[i];
        }

        return max;
    }
}
