package collections.sorting;

import java.util.*;

/**
 * Created by rbiswas on 6/28/2015.
 * Sort by bank names and then by transaction amounts for a user's accounts
 */
public class CustomSortingApp {
    public static void main(String[] args) {
        List<Account> accountsList = new ArrayList<>();

        Account icici = new Account("ICICI");
        Account hdfc = new Account("HDFC");

        icici.addTransaction("ATM Withdrawal", 500.00);
        icici.addTransaction("Groceries", 121.00);
        icici.addTransaction("Rent", 8000.00);
        icici.addTransaction("restaurant", 767.34);

        hdfc.addTransaction("ATM Withdrawal", 500.00);
        hdfc.addTransaction("Recharge", 373.00);
        hdfc.addTransaction("Transfers", 5000.00);
        hdfc.addTransaction("Utility Bill", 900.00);

        accountsList.add(icici);
        accountsList.add(hdfc);
    }
}

class Account implements Comparable<String>{
    private String accountName;
    private List<Transaction> trasactionsList = new ArrayList<>();

    Account(String accountName) {
        this.accountName = accountName;
    }

    public void addTransaction(String desc, double amt) {
        trasactionsList.add(new Transaction(desc, amt));
    }

    @Override
    public int compareTo(String accNameParam) {
        return accountName.compareToIgnoreCase(accNameParam);
    }
}

class Transaction implements Comparable<Double> {
    private int id;
    private static int identifier = 0;
    private String desc;
    private Double amt;


    private Map<String, Double> transMap = new HashMap<>(10);

    Transaction(String desc, double amt) {
        this.id = ++identifier;
        this.desc = desc;
        this.amt = amt;
    }

    @Override
    public int compareTo(Double amtParam) {
        return amt.compareTo(amtParam);
    }

    public String getDescription() {
        return desc;
    }

    public Double getAmount() {
        return amt;
    }
}
