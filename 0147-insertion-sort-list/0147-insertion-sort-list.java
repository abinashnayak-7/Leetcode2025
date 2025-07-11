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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        ListNode sortedTail = head;

        while (temp != null) {
            if (temp.val >= sortedTail.val) {
                sortedTail = temp;
                temp = temp.next;
                continue;
            }
            sortedTail.next = temp.next;

            ListNode prev = null;
            ListNode t1 = head;

            while (t1 != sortedTail.next) {
                if (t1.val >= temp.val) {
                    break;
                }
                prev = t1;
                t1 = t1.next;
            }
            //insertion at head
            if (prev == null) {
                temp.next = head;
                head = temp;
            } else {
                temp.next = prev.next;
                prev.next = temp;
            }
            temp = sortedTail.next;
        }
        return head;
    }
}