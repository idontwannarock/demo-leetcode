package algorithms.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void init() {
        this.twoSum = new TwoSum();
    }

    @Test
    public void shouldReturnZeroOne() {
        int[] givenNumbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(givenNumbers, target));
    }

    @Test
    public void shouldReturnNull() {
        int[] givenNumbers = {2, 8, 11, 15};
        int target = 9;
        assertNull(twoSum.twoSum(givenNumbers, target));
    }
}
