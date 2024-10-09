package NeetCode150Test;

import NeetCode150.AnagramCheck;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AnagramCheckTest {

    @Test
    public void testAnagram() {
        // given
        String s1 = "racecar";
        String s2 = "carrace";
        // when
        boolean result = AnagramCheck.isAnagram(s1, s2);

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void testAnagramFalse() {
        // given
        String s1 = "daisy";
        String s2 = "paisy";
        // when
        boolean result = AnagramCheck.isAnagram(s1, s2);
        // then
        Assert.assertFalse(result);
    }

}
