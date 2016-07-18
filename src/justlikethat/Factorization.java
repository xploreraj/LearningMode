package justlikethat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbiswas on 6/5/2015.
 */
public class Factorization {
    public static void main(String[] args) {
        int number = 24;
        int factor = 1;
        while(factor <= number) {
            if (number%factor == 0) {
                System.out.println(factor + " is a factor of " + number);
            }
            factor++;
        }
    }
}
