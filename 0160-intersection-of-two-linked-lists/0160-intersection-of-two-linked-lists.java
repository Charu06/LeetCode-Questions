/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0, c2=0;
        ListNode curr1=headA, curr2=headB;
        while(curr1!=null){
            c1++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            c2++;
            curr2=curr2.next;
        }
        curr1=headA; curr2=headB;
        int diff=Math.abs(c1-c2);
        if(c1>c2){
            while(diff!=0){
                curr1=curr1.next;
                diff--;
            }
        }
        else if(c2>c1){
            while(diff!=0){
                curr2=curr2.next;
                diff--;
            }
        }
        while(curr1!=null){
            if(curr1==curr2)
                return curr1;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;
    }
}