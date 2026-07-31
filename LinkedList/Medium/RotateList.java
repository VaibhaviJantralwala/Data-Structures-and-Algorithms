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
        
        int n = 1;
        if(head == null || head.next == null || k == 0){ 
            return head; 
        }

        // length of list
        ListNode temp1 = head;
        while( temp1.next != null ){
            temp1 = temp1.next;
            n++;
        }

        if( k % n == 0 ) return head;

        // for large values of k
        k = k % n ;

        // make list circular 
        temp1.next = head;

        // node whose next we have to make null : n - k 
        ListNode tail = head ; 
        int count = 0;
        while( count != n-k-1 ){
            tail = tail.next;
            count++;
        }

        ListNode newHead = tail.next;

        tail.next = null;

        return newHead;
    }
}
