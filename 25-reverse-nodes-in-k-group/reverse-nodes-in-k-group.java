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

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode first = new ListNode(0);
        first.next = head;
        head = first;

        while (first.next != null) {
            int x = k;

            ListNode curr = first.next;
            ListNode prev = first;
            ListNode second = first.next;

            ListNode check = first;
            for (int i = 0; i < k && check != null; i++) {
                check = check.next;
            }
            if (check == null)
                break; // not enough nodes left → stop
            while (x > 0 && curr != null) {
                ListNode front = curr.next;
                curr.next = prev;
                prev = curr;
                curr = front;
                x--;
            }
            first.next = prev;
            second.next = curr;
            first = second;
        }
        first = head;
        head = head.next;
        return head;
    }
}