/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return;
        nextRec(root.left,root.right);
        nextRec(root.right, null);        
    }
    
     void nextRec(TreeLinkNode root, TreeLinkNode next) {
         if(root==null) return;
         root.next=next;
         
         nextRec(root.left,root.right);
         if(next!=null) nextRec(root.right,next.left);
         else nextRec(root.right,null);
         
         
     }
}