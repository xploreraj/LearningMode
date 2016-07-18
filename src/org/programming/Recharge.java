package org.programming;

/**
 * Created by rbiswas on 3/31/2015.
 * Problem Statement:
 * Compute the charges as follows:
 * 1. 2% if topup  < 5,000
 * 2. 1.5% if 5,000 <= topup < 10,000
 * 3. 1% if topup >= 10,000
 * 4. If customer has already recharged worth 5,000 in a month, then rest of the topups are charged @ 0.5%
 * 5. Every month, two toups <=5,000 are free
 * 6. Charges are rounded to nearest higher Rupee (e.g. 9.23 is rounded to 10)
 * Input Specification:
 * 1. Number of records (N), followed by
 * 2. N lines of txn data: Transaction Date, Subscriber Name, Amount
 * e.g.
 * 3
 * 2014-06-25,Subscriber-A,1000.00
 * 2014-06-28,Subscriber-B,600.00
 * 2014-07-01,Subscriber-A,400.00
 */
public class Recharge {
    public static void main(String[] args) {

    }
}
