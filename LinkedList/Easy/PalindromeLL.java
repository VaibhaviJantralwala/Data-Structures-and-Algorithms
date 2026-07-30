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
    public boolean isPalindrome(ListNode head) {
       
       ListNode slow = head;
       ListNode fast = head;

       while( fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
       }

       ListNode mid = slow;

       ListNode revHead = reverseLL(slow.next);

       ListNode first = head;
       ListNode second = revHead;

       while( second != null ){

            if( first.val != second.val ){
                reverseLL(revHead);
                return false;
            } 
            first = first.next;
            second = second.next;
       }
        return true;
    }

    private ListNode reverseLL(ListNode mid){
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while( curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
