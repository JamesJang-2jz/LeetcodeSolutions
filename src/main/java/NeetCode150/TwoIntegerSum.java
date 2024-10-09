package NeetCode150;

import java.util.HashMap;

public class TwoIntegerSum {

    public static int[] twoSum(int[] nums, int target) {
//        int[] indies = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (target - nums[i] == nums[j]) {
//                    indies[0] = i;
//                    indies[1] = j;
//                }
//            }
//        }
//        return indies;

        HashMap<Integer, Integer> mappy = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (mappy.containsKey(diff)){
                return new int[] {mappy.get(diff), i};
            }
            mappy.put(num, i);
        }
        return new int[]{};


    }
}
