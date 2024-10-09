package NeetCode150;

import java.util.*;

public class GroupAnagrams {
    /**
     * this method takes in an array of strings and sorts into groups by anagram
     * @param strs array
     * @return the List of grouped Anagram strings
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramSorted = new HashMap<>();

        // iterate thru the strs array/ turn into char array and sort
        for (String s : strs) {
            char[] charmandarray = s.toCharArray();
            Arrays.sort(charmandarray);
            // sorted string is used as key in hashmap
            // whatever follows will also be sorted and if already present will be put under the same key
            String sorted = new String(charmandarray);
            anagramSorted.putIfAbsent(sorted, new ArrayList<>());
            anagramSorted.get(sorted).add(s);
        }
        return new ArrayList<>(anagramSorted.values());
    }
}
