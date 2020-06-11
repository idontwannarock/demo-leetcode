package algorithms.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void init() {
        this.palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void testEvenIntShouldReturnTrue() {
        // arrange
        int input = 2332;
        // action
        boolean actual = palindromeNumber.isPalindrome(input);
        // assert
        assertTrue(actual);
    }

    @Test
    public void testOddIntShouldReturnTrue() {
        // arrange
        int input = 121;
        // action
        boolean actual = palindromeNumber.isPalindrome(input);
        // assert
        assertTrue(actual);
    }

    @Test
    public void testNegativeShouldReturnFalse() {
        // arrange
        int input = -121;
        // action
        boolean actual = palindromeNumber.isPalindrome(input);
        // assert
        assertFalse(actual);
    }

    @Test
    public void testTenShouldReturnFalse() {
        // arrange
        int input = 10;
        // action
        boolean actual = palindromeNumber.isPalindrome(input);
        // assert
        assertFalse(actual);
    }

    @Test
    public void testOneThousandAndOneShouldReturnTrue() {
        // arrange
        int input = 1001;
        // action
        boolean actual = palindromeNumber.isPalindrome(input);
        // assert
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalse() {
        // arrange
        int input = 1000021;
        // action
        boolean actual = palindromeNumber.isPalindrome(input);
        // assert
        assertFalse(actual);
    }
}
