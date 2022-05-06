package algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {

    @Test
    public void should_return_three() {
        // arrange
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;

        // act
        int actual = new CoinChange().coinChange(coins, amount);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_minus_one() {
        // arrange
        int[] coins = {2};
        int amount = 3;
        int expected = -1;

        // act
        int actual = new CoinChange().coinChange(coins, amount);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_zero() {
        // arrange
        int[] coins = {1};
        int amount = 0;
        int expected = 0;

        // act
        int actual = new CoinChange().coinChange(coins, amount);

        // assert
        Assert.assertEquals(expected, actual);
    }
}
