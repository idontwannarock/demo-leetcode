package algorithms.medium;

public class MaxTwinSumOfALinkedList {

    public int pairSum(ListNode head) {
        // safeguard condition
        if (head == null) return 0;
        if (head.next == null) return head.val;
        if (head.next.next == null) return head.val + head.next.val;


        // find the end of the first half
        ListNode firstHalfEnd = head;
        ListNode end = head.next;
        while (end.next != null) {
            firstHalfEnd = firstHalfEnd.next;
            end = end.next.next;
        }

        // reverse the second half
        ListNode secondHalfHead = reverseHead(firstHalfEnd.next);

        // find max sum
        int maxSum = 0;
        while (secondHalfHead != null) {
            maxSum = Math.max(maxSum, head.val + secondHalfHead.val);
            head = head.next;
            secondHalfHead = secondHalfHead.next;
        }

        return maxSum;
    }

    private ListNode reverseHead(ListNode node) {
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = next;
            next = current;
            current = temp;
        }
        return next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
