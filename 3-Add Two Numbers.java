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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuilder strRet=new StringBuilder();
        ListNode head=new ListNode(0);
        ListNode ret=head;
        
        int carrier=0;
        
        while(l1!=null || l2!=null ){
            if(l1!=null) {                
                carrier+=l1.val;
                l1=l1.next;
            }            
            
            if(l2!=null) {                
                carrier+=l2.val;
                l2=l2.next;
            }     
            
           
           

          head.next=new ListNode(carrier%10);
           carrier=carrier/10;
                head=head.next;
        }
        
        if(carrier==1) head.next=new ListNode(1);
        
        return ret.next;
    }
}