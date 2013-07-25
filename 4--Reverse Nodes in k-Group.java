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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null || head.next==null || k==1) return head;
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        
        int i=0;
        while(head!=null){
            i++;
            if(i%k==0){
                pre=reverse(pre,head.next);
                head=pre.next;                
            }
            else head=head.next;
            
        }
        
        return dummy.next;
    }
    
    public ListNode reverse(ListNode pre,ListNode next){
        ListNode last=pre.next;
        ListNode cur=last.next;
        while(cur!=next){
            last.next=cur.next;
            cur.next=pre.next;
            pre.next=cur;
            cur=last.next;
        }
        return last;
    }
    
    
}