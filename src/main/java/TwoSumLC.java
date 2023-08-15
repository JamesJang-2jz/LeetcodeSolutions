import java.util.HashMap;
import java.util.Map;

public class TwoSumLC {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum(int[] nums, int target, String HashMapSolution){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int goldSnitch = target - nums[i];
            if (map.containsKey(goldSnitch)){ // first iteration will skip because map is empty
                return new int[]{map.get(goldSnitch), i}
;            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
