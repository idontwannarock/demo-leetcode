package algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class MaxTwinSumOfALinkedListTest {

    @Test
    public void four_elements_should_return_six() {
        // arrange
        int[] linkedList = {5,4,2,1};
        int expected = 6;

        // act
        int actual = pairSum(linkedList);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void four_elements_should_return_seven() {
        // arrange
        int[] linkedList = {4,2,2,3};
        int expected = 7;

        // act
        int actual = pairSum(linkedList);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void many_elements_should_return() throws IOException {
        // arrange
        int[] linkedList = Arrays.stream(Files.readString(Path.of("static/MaxTwinSumOfALikedListTestCase.txt"), StandardCharsets.UTF_8).split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int expected = 199404;

        // act
        int actual = pairSum(linkedList);

        // assert
        Assert.assertEquals(expected, actual);
    }

    private int pairSum(int[] linkedList) {
        if (linkedList.length == 1) {
            return new MaxTwinSumOfALinkedList().pairSum(new ListNode(linkedList[0]));
        }

        ListNode head = new ListNode(linkedList[0]);
        ListNode last = head;
        for (int currentIndex = 1; currentIndex < linkedList.length; currentIndex++) {
            ListNode current = new ListNode(linkedList[currentIndex]);
            last.next = current;
            last = current;
        }
        return new MaxTwinSumOfALinkedList().pairSum(head);
    }
}
