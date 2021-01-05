package algorithms.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @Before
    public void init() {
        this.longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void shouldReturnFl() {
        // arrange
        String[] inputs = {"flower","flow","flight"};
        String expected = "fl";

        // action
        String actual = longestCommonPrefix.longestCommonPrefix3(inputs);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBlank() {
        // arrange
        String[] inputs = {"dog","racecar","car"};
        String expected = "";

        // action
        String actual = longestCommonPrefix.longestCommonPrefix3(inputs);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnC() {
        // arrange
        String[] inputs = {"c","c"};
        String expected = "c";

        // action
        String actual = longestCommonPrefix.longestCommonPrefix3(inputs);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnA() {
        // arrange
        String[] inputs = {"aa","a"};
        String expected = "a";

        // action
        String actual = longestCommonPrefix.longestCommonPrefix3(inputs);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBlankWithNoInput() {
        // arrange
        String[] inputs = {};
        String expected = "";

        // action
        String actual = longestCommonPrefix.longestCommonPrefix3(inputs);

        // assert
        assertEquals(expected, actual);
    }
}
