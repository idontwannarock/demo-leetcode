package algorithms.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void init() {
        this.validParentheses = new ValidParentheses();
    }

    @Test
    public void onePairOfBracketsShouldReturnTrue() {
        // arrange
        String input = "()";

        // act
        boolean actual = validParentheses.isValid(input);

        // assert
        assertTrue(actual);
    }

    @Test
    public void sequentialBracketsShouldReturnTrue() {
        // arrange
        String input = "()[]{}";

        // act
        boolean actual = validParentheses.isValid(input);

        // assert
        assertTrue(actual);
    }

    @Test
    public void oneStartingBracketAndOneEndingSquareBracketShouldReturnFalse() {
        // arrange
        String input = "(]";

        // act
        boolean actual = validParentheses.isValid(input);

        // assert
        assertFalse(actual);
    }

    @Test
    public void overlappedBracketsAndSquareBracketsShouldReturnFalse() {
        // arrange
        String input = "([)]";

        // act
        boolean actual = validParentheses.isValid(input);

        // assert
        assertFalse(actual);
    }

    @Test
    public void claddingBracketsAndSquareBracketsShouldReturnTrue() {
        // arrange
        String input = "{[]}";

        // act
        boolean actual = validParentheses.isValid(input);

        // assert
        assertTrue(actual);
    }

    @Test
    public void oneEndingBracketAndOneStartingCurlyBracketShouldReturnFalse() {
        // arrange
        String input = "){";

        // act
        boolean actual = validParentheses.isValid(input);

        // assert
        assertFalse(actual);
    }
}
