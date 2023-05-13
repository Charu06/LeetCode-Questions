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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=null;
        ListNode prev=null;
        ListNode cur=slow;
        while(cur!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        while(head!=null && prev!=null){
            if(head.val!=prev.val)
                return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}