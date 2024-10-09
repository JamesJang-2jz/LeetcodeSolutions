package NeetCode150Test;

import NeetCode150.GroupAnagrams;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void test1() {
        // given
        String[] anagrams = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<String> list1 = Arrays.asList("hat");
        List<String> list2 = Arrays.asList("act", "cat");
        List<String> list3 = Arrays.asList("pots", "tops", "stop");
        // when
        List<List<String>> expected = new ArrayList<>();
        expected.add(list2);
        expected.add(list3);
        expected.add(list1);
        List<List<String>> result = GroupAnagrams.groupAnagrams(anagrams);
        // then
        Assert.assertEquals(result, expected);
    }


}
