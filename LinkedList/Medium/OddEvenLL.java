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
    public ListNode oddEvenList(ListNode head) {

        ListNode oDummy = new ListNode(0);
        ListNode eDummy = new ListNode(0);

        ListNode odd = oDummy;
        ListNode even = eDummy;

        ListNode curr = head;
        int n = 1;

        while( curr != null ){

            if( n % 2 != 0 ){
                odd.next = curr;
                odd = odd.next;
            }
            else{
                even.next = curr;
                even = even.next;
            }

            curr = curr.next;
            n++;
        }

        odd.next = eDummy.next;
        even.next = null;
        return oDummy.next;
    }
}
