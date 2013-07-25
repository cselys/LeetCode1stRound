/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        
        int length=0;
        ListNode root=head,root2=head;
        while(root!=null) {length++;root=root.next;}
        return sortedToBST(head,0,length-1);
        
    }
    
    TreeNode sortedToBST(ListNode list, int start, int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;

              
        TreeNode lft=sortedToBST(list,start, mid-1);
 
         TreeNode root=new TreeNode(list.val);
        root.left=lft;
        list=list.next;
        
        root.right=sortedToBST(list,mid+1,end);
      
        return root;
    }
}




http://leetcode.com/2010/11/convert-sorted-list-to-balanced-binary.html
