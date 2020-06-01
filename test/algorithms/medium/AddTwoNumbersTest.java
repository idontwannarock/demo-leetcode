package algorithms.medium;

import algorithms.medium.AddTwoNumbers;
import org.junit.Before;
import org.junit.Test;

import static algorithms.medium.AddTwoNumbers.ListNode;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @Before
    public void init() {
        this.addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    public void shouldReturnEightZeroSeven() {
        // arrange
        ListNode first = new ListNode(2);
        first.next = new ListNode(4);
        first.next.next = new ListNode(3);

        ListNode second = new ListNode(5);
        second.next = new ListNode(6);
        second.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        // action
        ListNode actual = addTwoNumbers.addTwoNumbers(first, second);

        // assert
        assertThat(actual, is(expected));
        assertThat(actual.next, is(expected.next));
        assertThat(actual.next.next, is(expected.next.next));
    }
}
