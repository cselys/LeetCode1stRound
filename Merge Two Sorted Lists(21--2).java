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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode lR,lRcur;
        
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        if(l1.val<l2.val) {lR=l1;l1=l1.next;}
        else {lR=l2;l2=l2.next;}
        lR.next=null;
        lRcur=lR;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                lRcur.next=l1;
                l1=l1.next;                
            }else{
                lRcur.next=l2;
                l2=l2.next;                
            }
            lRcur=lRcur.next;
        }
        
        if(l1==null) lRcur.next=l2;
        else lRcur.next=l1;        
    return lR;
    
    }
    
}