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
        ArrayDeque<Integer> s1=new ArrayDeque<>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        ArrayDeque<Integer> s2=new ArrayDeque<>();
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int c=0;
        ListNode curr=null;
        while(!s1.isEmpty() || !s2.isEmpty() || c!=0){
            int x=(!s1.isEmpty())?s1.pop():0;
            int y=(!s2.isEmpty())?s2.pop():0;
            int sum=x+y+c;
            c=sum/10;
            sum=sum%10;
            curr=new ListNode(sum, curr);
        }
        return curr;
    }
}