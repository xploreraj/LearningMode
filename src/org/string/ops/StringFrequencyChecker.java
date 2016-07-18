package org.string.ops;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Find the occurrence of words in a given string.
 */
public class StringFrequencyChecker {
    public static void main(String[] args) {
        String phrase = "Pulpy papaya looks like pulpy papaya and can be used in shakes,"
                + "like papaya and mango smoothie or papaya berry smoothie.";
        phrase = phrase.replaceAll("[,.?!]","");
        String[] words = phrase.split("[\\s]");
        Map<String, Integer> map = new HashMap<>();
        Integer frequency;
        for (String word : words) {
            frequency = (Integer) map.get(word);
            frequency = frequency == null ? 1 : frequency + 1;
            map.put(word, frequency);
        }

//        Map<String, Integer> sortedMap = new TreeMap<String, Integer>(map, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return 0;
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        });
    }
}
