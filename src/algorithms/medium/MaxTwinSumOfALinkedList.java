package algorithms.medium;

public class MaxTwinSumOfALinkedList {

    public int pairSum(int[] linkedList) {
        if (linkedList.length == 1) {
            return pairSum(new ListNode(linkedList[0]));
        }

        ListNode head = new ListNode(linkedList[0]);
        ListNode last = head;
        for (int currentIndex = 1; currentIndex < linkedList.length; currentIndex++) {
            ListNode current = new ListNode(linkedList[currentIndex]);
            last.next = current;
            last = current;
        }
        return pairSum(head);
    }

    public int pairSum(ListNode head) {
        if (head.next == null) return head.val;
        if (head.next.next == null) return head.val + head.next.val;

        ListNode firstHalfEnd = head;
        ListNode end = head.next;
        while (end.next != null) {
            firstHalfEnd = firstHalfEnd.next;
            end = end.next.next;
        }

        int maxSum = 0;

        ListNode firstLast = firstHalfEnd.next;
        ListNode secondLast = firstHalfEnd;
        while (secondLast.next != null) {
            ListNode firstCurrent = head;
            while (!firstCurrent.next.equals(firstLast)) {
                firstCurrent = firstCurrent.next;
            }
            firstLast = firstCurrent;

            secondLast = secondLast.next;

            maxSum = Math.max(maxSum, firstLast.val + secondLast.val);
        }

        return maxSum;
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
