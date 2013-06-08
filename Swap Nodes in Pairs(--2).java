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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(head==null||head.next==null) return head;
        
        ListNode cur=head;
        ListNode head2=cur.next;
        ListNode pre=cur;
                        
        cur.next=head2.next;
        head2.next=cur;
        pre=cur;
        cur=cur.next;
        head=head2;
                
        while(cur!=null && cur.next!=null ){
            
            head2=cur.next;            
            cur.next=head2.next;
            head2.next=cur;
            pre.next=head2;
            pre=cur;
            cur=cur.next;                        
            
        }
    return head;
    
    }
    
}