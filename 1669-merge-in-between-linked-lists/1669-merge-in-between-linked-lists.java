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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1=list1;
        int x=0;
        while(x!=a-1){
            curr1=curr1.next;
            x++;
        }
        ListNode curr2=list1;
        x=0;
        while(x!=b+1){
            curr2=curr2.next;
            x++;
        }
        curr1.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=curr2;
        return list1;
    }
}