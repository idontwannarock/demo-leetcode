package algorithms.medium;

import java.util.Objects;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {

    // https://leetcode.com/problems/add-two-numbers/
    //
    // You are given two non-empty linked lists representing two non-negative integers.
    // The digits are stored in reverse order and each of their nodes contain a single digit.
    // Add the two numbers and return it as a linked list.
    //
    // You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    //
    // Example:
    //
    // Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    // Output: 7 -> 0 -> 8
    // Explanation: 342 + 465 = 807.
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        // parse list1 value
        Integer list1Value = null;
        if (list1 != null) {
            ListNode current = list1;
            Stack<String> list1Stack = new Stack<>();
            list1Stack.push(String.valueOf(current.val));
            while (current.next != null) {
                list1Stack.push(String.valueOf(current.next.val));
                current = current.next;
            }
            StringBuilder list1String = new StringBuilder();
            while (!list1Stack.empty()) {
                list1String.append(list1Stack.pop());
            }
            list1Value = Integer.valueOf(list1String.toString());
        }
        System.out.println(list1Value);
        // parser list2 value
        Integer list2Value = null;
        if (list2 != null) {
            ListNode current = list2;
            Stack<String> list2Stack = new Stack<>();
            list2Stack.push(String.valueOf(current.val));
            while (current.next != null) {
                list2Stack.push(String.valueOf(current.next.val));
                current = current.next;
            }
            StringBuilder list2String = new StringBuilder();
            while (!list2Stack.empty()) {
                list2String.append(list2Stack.pop());
            }
            list2Value = Integer.valueOf(list2String.toString());
        }
        System.out.println(list2Value);
        // do summation of two values
        String sum = "0";
        if (list1Value != null && list2Value != null) {
            sum = String.valueOf(list1Value + list2Value);
        } else if (list1Value != null) {
            sum = String.valueOf(list1Value);
        } else if (list2Value != null) {
            sum = String.valueOf(list2Value);
        }
        System.out.println("summation: " + sum);
        // convert sum to list node
        ListNode result = new ListNode(Integer.parseInt(sum.substring(sum.length() - 1)));
        ListNode last = result;
        for (int i = 1; i < sum.length(); i++) {
            ListNode current = new ListNode(Integer.parseInt(sum.substring(sum.length() - i - 1, sum.length() - i)));
            last.next = current;
            last = current;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
        public String toString() {
            return String.valueOf(val);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val &&
                    Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
