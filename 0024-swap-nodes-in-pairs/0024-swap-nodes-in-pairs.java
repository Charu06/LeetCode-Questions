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
    public ListNode swapPairs(ListNode head) {
        ListNode d=new ListNode(0,head);
        ListNode curr=d;
        while(curr.next!=null && curr.next.next!=null){
            ListNode t1=curr.next;
            ListNode t2=curr.next.next;
            curr.next=t2;
            t1.next=t2.next;
            t2.next=t1;
            curr=t1;
        }
        return d.next;
    }
}