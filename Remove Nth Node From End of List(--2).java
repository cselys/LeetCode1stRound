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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode pre,first;
        
        first=head;
        
        for(int i=0;i<n;i++)
           first=first.next;
        
        if(first==null) return head.next;
        
        first=first.next;
        
        pre=head;
        
        while(first!=null){
            first=first.next;
            pre=pre.next;
            
        }
        
        if(pre.next!=null)
            pre.next=pre.next.next;
        else
            pre=null;
        
        return head;
            
    }
}