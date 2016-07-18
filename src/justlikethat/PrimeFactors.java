package justlikethat;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by rbiswas on 6/5/2015.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        int n = 12;
        List<Integer> list = new ArrayList<>();
        for ( int i=2; i <= n; i++) {
            while (n % i == 0) {
                list.add(i);
                n = n/i;
            }
        }
        System.out.println("All prime factors:      " + list);
        System.out.println("Distinct prime factors: " + new TreeSet<>(list));
    }
}
