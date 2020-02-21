package algorithms.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntTest {

    private RomanToInt romanToInt;

    @Before
    public void init() {
        romanToInt = new RomanToInt();
    }

    @Test
    public void shouldReturnThree() {
        // arrange
        String input = "III";
        int expected = 3;
        // action
        int actual = romanToInt.romanToInt(input);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFour() {
        // arrange
        String input = "IV";
        int expected = 4;
        // action
        int actual = romanToInt.romanToInt(input);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNine() {
        // arrange
        String input = "IX";
        int expected = 9;
        // action
        int actual = romanToInt.romanToInt(input);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFiftyEight() {
        // arrange
        String input = "LVIII";
        int expected = 58;
        // action
        int actual = romanToInt.romanToInt(input);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNineteenNinetyFour() {
        // arrange
        String input = "MCMXCIV";
        int expected = 1994;
        // action
        int actual = romanToInt.romanToInt(input);
        // assert
        assertEquals(expected, actual);
    }
}
