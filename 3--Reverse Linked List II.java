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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return head;
        
        ListNode temp=new ListNode(0);
        temp.next=head;
        
        ListNode cur=head.next, pre=head, next, start=temp;
        
        int count =1;
        
        while(count<=n){
            if(count>=m && count<n){
                next=cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }else if(count==n){
                start.next.next=cur;
                start.next=pre;
            }else{
                start=pre;
                pre=cur;
                cur=cur.next;
            }
            count++;            
        }
        return temp.next;
    }
}