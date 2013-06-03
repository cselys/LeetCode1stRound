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
    public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return getLen(root);
    }
    
    int getLen(TreeNode root){
        
        if(root==null) return 0;
        
                
        return 1+Math.max(getLen(root.left),getLen(root.right));
    }
}