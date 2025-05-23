/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        int maxSum = Integer.MIN_VALUE;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            //reverse
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        //finding max sum
        while (slow != null) {
            int currSum = (prev.val + slow.val);
            maxSum = Math.max(currSum, maxSum);

            slow = slow.next;
            prev = prev.next;
        }
        return maxSum;
    }
}