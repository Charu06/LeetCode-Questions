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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head;
        ListNode temp=head;
        int sum=0;
        while(curr.next!=null){
            sum+=curr.next.val;
            if(curr.next.val==0){
                ListNode x=new ListNode(sum);
                temp.next=x;
                temp=temp.next;
                sum=0;
            }
            curr=curr.next;                
        }
        return head.next;
    }
}