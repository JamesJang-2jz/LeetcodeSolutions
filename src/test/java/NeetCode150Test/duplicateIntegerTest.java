package NeetCode150Test;


import NeetCode150.DuplicateInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class duplicateIntegerTest {

    @Test
    public void testTrue() {
        // given
        int[] input = {1, 2, 3,4,5,5,6};

        // then
        boolean expected = true;

        testDuplicate(input, expected);
    }

    @Test
    public void testFalse() {
        // given
        int[] input = {1,45,345,7,3};
        // then
        boolean expected = false;

        testDuplicate(input, expected);
    }


    private void testDuplicate(int[] input, boolean expected) {
        Boolean result = DuplicateInteger.hasDuplicate(input);
        System.out.println(result);
        assertEquals(result, expected);
    }
}
