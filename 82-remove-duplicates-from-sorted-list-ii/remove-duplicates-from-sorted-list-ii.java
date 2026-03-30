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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.val == temp.val){

                while(temp.next != null && temp.next.val == temp.val){  
                    temp = temp.next;
                }
                temp = temp.next;
                prev.next = temp;
            }
            else{
                prev = prev.next;
                temp = temp.next;

            }
        }
        return dummy.next;
    }
}