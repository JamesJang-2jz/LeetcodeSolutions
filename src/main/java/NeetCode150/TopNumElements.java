package NeetCode150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopNumElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> sort = new HashMap<>();
        for (int num: nums) {
            sort.put(num, sort.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sort.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1];
        }
        return result;

    }
}
