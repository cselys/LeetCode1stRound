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
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return 0;
        return sum(root,0);
    }
    
    int sum(TreeNode root, int prev){
        if(root.right==null && root.left==null)
            return prev*10+root.val;
        else if(root.right!=null && root.left!=null) 
            return sum(root.right,prev*10+root.val)+sum(root.left,prev*10+root.val);
        else if(root.right!=null) 
            return sum(root.right,prev*10+root.val);
        else if(root.left!=null) 
            return sum(root.left,prev*10+root.val);
        return 0;
    }
}