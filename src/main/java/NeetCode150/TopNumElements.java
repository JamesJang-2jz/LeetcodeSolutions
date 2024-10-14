package NeetCode150;

import java.util.*;

public class TopNumElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> sort = new HashMap<>();
        // loop thru nums and sort by placing into hashmap
        // num is the key, and value is the frequency
        for (int num: nums) {
            sort.put(num, sort.getOrDefault(num, 0) + 1);
        }
        // create new arraylist with int[] as parameter
        // get entryset of hashmap above and add to int[] array, added to List
        // int[0] is the value from hashmap above = the frequency
        // int[1] is the key from hashmap above = the actual number
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sort.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        // List then sorted by highest frequency of first value. b - a
        // sorting the highest frequency to lowest.
        arr.sort((a, b) -> b[0] - a[0]);

        // then loop thru and add to new int[]
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1];
        }
        System.out.println(Arrays.toString(arr.get(0)));
        System.out.println(Arrays.deepToString(arr.toArray()));
        System.out.println(result[0]);
        return result;

    }
}
