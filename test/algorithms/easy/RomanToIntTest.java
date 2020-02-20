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
}
