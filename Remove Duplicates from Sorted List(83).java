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
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return head;
        ListNode cur=head;
        HashSet<Integer> hsD=new HashSet<Integer>();
        hsD.add(cur.val);
        while(cur.next!=null){
            if(hsD.add(cur.next.val))cur=cur.next;
            else 
            {
                cur.next=cur.next.next;
                if(cur.next==null) return head;
                
            }
        }
        return head;
        
                
    }
}