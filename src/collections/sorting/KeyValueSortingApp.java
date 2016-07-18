package collections.sorting;

import com.sun.istack.internal.NotNull;

import java.util.*;

/**
 * Sort by key first and then by value
 */
public class KeyValueSortingApp {
    public static void main(String[] args) {
        Set<KeyValuePair> sortedSet = new TreeSet<KeyValuePair>();
        sortedSet.add(new KeyValuePair("icici",400));
        sortedSet.add(new KeyValuePair("icici",200));
        sortedSet.add(new KeyValuePair("icici",50));
        sortedSet.add(new KeyValuePair("sbi",320));
        sortedSet.add(new KeyValuePair("icici",300));
        sortedSet.add(new KeyValuePair("sbi",100));

        for (KeyValuePair pair : sortedSet) {
            System.out.println(pair.key + ":" + pair.value);
        }
    }
}

class KeyValuePair implements Comparable<KeyValuePair> {
    String key;
    int value;
    public KeyValuePair(String key, int value) {
        super();
        this.key = key;
        this.value = value;
    }
    @Override
    public int compareTo(@NotNull KeyValuePair o) {
        return key.equalsIgnoreCase(o.key) ? value-o.value : key.compareToIgnoreCase(o.key);
    }
}