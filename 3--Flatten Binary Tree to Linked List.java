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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        _flatten(root);
    }
    
    TreeNode _flatten(TreeNode root){
        if(root==null) return null;
        
        TreeNode left=root.left;
        TreeNode right=root.right;
        
        
        TreeNode leftflatten=_flatten(left);
        if(leftflatten==null) leftflatten=root;
        
        TreeNode rightflatten=_flatten(right);
        if(rightflatten==null) rightflatten=leftflatten;
        
        
        root.left=null;
        root.right=left;
        leftflatten.right=right;
        
        return rightflatten;
    
    }
}