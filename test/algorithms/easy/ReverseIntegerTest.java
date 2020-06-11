package algorithms.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void init() {
        this.reverseInteger = new ReverseInteger();
    }

    @Test
    public void shouldReturnThreeTwoOne() {
        // arrange
        int input = 123;
        int expected = 321;

        // action
        int actual = reverseInteger.reverse(input);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNegativeThreeTwoOne() {
        // arrange
        int input = -123;
        int expected = -321;

        // action
        int actual = reverseInteger.reverse(input);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTwoOne() {
        // arrange
        int input = 120;
        int expected = 21;

        // action
        int actual = reverseInteger.reverse(input);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZero() {
        // arrange
        int input = 2_147_483_647;
        int expected = 0;

        // action
        int actual = reverseInteger.reverse(input);

        // assert
        assertEquals(expected, actual);
    }
}
