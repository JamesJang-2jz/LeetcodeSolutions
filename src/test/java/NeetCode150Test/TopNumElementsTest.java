package NeetCode150Test;

import NeetCode150.TopNumElements;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TopNumElementsTest {

    @Test
    public void test1() {
        // given
    int[] nums = {1,2,2,3,3,3};
    int k = 2;
        // when
        int[] expected = {3,2};
        int[] actual = TopNumElements.topKFrequent(nums, k);
        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        int[] nums = {1,7,7};
        int k = 1;
        // when
        int[] expected = {7};
        int[] actual = TopNumElements.topKFrequent(nums, k);
        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
