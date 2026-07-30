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
    public void reorderList(ListNode head) {
        
        // find middle
        ListNode slow = head;
        ListNode fast = head;

        while( fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        // rev the 2nd half
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        ListNode nextNode;

        while( curr != null ){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // merge alternatively
        ListNode first = head;
        ListNode second = prev;

        ListNode fNext , sNext;

        while( second != null ){
            fNext = first.next;
            sNext = second.next;

            first.next = second;
            second.next = fNext;

            first = fNext;
            second = sNext;
        }

    }
}
