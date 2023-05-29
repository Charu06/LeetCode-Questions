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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack s1=new Stack();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        Stack s2=new Stack();
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        Stack res=new Stack();
        int c=0;
        while(!s1.isEmpty() || !s2.isEmpty() || c!=0){
            int x=(!s1.isEmpty())?(int)s1.pop():0;
            int y=(!s2.isEmpty())?(int)s2.pop():0;
            int sum=x+y+c;
            c=sum/10;
            sum=sum%10;
            res.push(sum);
        }
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        while(!res.isEmpty()){
            ListNode n=new ListNode((int)res.pop());
            curr.next=n;
            curr=curr.next;
        }
        return dummy.next;
    }
}