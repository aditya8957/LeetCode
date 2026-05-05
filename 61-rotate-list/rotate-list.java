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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) return head;

        // find tail and length;
        ListNode tail = head;
        int len = 1;

        while(tail.next != null){
            len++;
            tail = tail.next;
        }

        if(k%len == 0) return head;

        // connect tail to head;
        tail.next = head;

        k = k%len;

        ListNode temp1 = head;
        for(int i=1; i<len-k; i++){
            temp1 = temp1.next;
        }
        ListNode newHead = temp1.next;
        temp1.next = null;
        return newHead;
    }
}