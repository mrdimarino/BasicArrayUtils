package ArrayUtil.Test;

import Array.Util.StringArrayUtil;
import org.junit.Assert;
import org.junit.Test;

public class StringArrayUtilTest {
    StringArrayUtil arrayUtil = new StringArrayUtil();

    @Test
    public void containsTestTrue(){
        //Given
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String value = "fox";

        //When
        boolean expected = arrayUtil.contains(array, value);

        //Then
        Assert.assertTrue(expected);

    }

    @Test
    public void containsTestFalse(){
        //Given
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String value = "blue";

        //When
        boolean expected = arrayUtil.contains(array, value);

        //Then
        Assert.assertFalse(expected);

    }

    @Test
    public void reverseTest() {
        String[] array = {"the", "quick", "brown", "fox", "jumps"};
        String[] expected = {"jumps", "fox", "brown", "quick", "the"};
        String[] actual = arrayUtil.reverse(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ssPalindromicTest() {
        String[] array = {"a", "b", "c", "b", "a"};
        boolean expected = arrayUtil.isPalindromic(array);
        Assert.assertTrue(expected);
    }

    @Test
    public void getNumberOfOccurrencesTest() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 4;
        int actual = arrayUtil.getNumberOfOccurrences(array, "bba");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeValueTest() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"quick", "brown", "fox", "jumps", "over", "lazy", "dog"};
        String[] actual = arrayUtil.removeValue(array, "the");
        Assert.assertArrayEquals(expected, actual);
    }
}
