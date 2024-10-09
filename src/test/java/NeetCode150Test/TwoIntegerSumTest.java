package NeetCode150Test;

import NeetCode150.TwoIntegerSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoIntegerSumTest {

    @Test
    public void test1() {
    // given
    int[] nums = {1,3,4,5};
    int target = 7;
    // when
    int[] result = TwoIntegerSum.twoSum(nums, target);
    int[] expected = {1,2};
    // then
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(expected));
    Assertions.assertArrayEquals(result, expected);
    }
}
