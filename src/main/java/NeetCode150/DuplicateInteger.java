package NeetCode150;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> dupiesRemoved = new HashSet<>();
        for (int i : nums) {
            dupiesRemoved.add(i);
        }

        if (dupiesRemoved.size() != nums.length){
            return true;
        }
        return false;
    }
}
