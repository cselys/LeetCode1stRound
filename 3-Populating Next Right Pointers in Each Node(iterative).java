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
        TreeLinkNode top=root, cur=root, first=root.left;
        
        while(top!=null && top.left!=null){
            while(top!=null){
                cur=top.left;
                cur.next=top.right;
                cur=cur.next;
                top=top.next;
                cur.next=(top==null)?null:top.left;
                
            }
            
            top=first;
            first=(top==null)?null:top.left;
        }
        
    }
}