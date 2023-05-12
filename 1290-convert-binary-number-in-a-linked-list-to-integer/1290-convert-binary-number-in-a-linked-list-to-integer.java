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
    public int getDecimalValue(ListNode head) {
        int res=0;
        int c=0;
        ListNode cur=head;
        while(cur!=null){
            c++;
            cur=cur.next;
        }
        cur = head;
        while(cur!=null){
            res+=(cur.val*Math.pow(2,--c));
            cur=cur.next;
        }
        return res;
    }
}