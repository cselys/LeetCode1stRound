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
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
     
        return height(root)!=-1;
        
    }
    
    int height(TreeNode root){
        if(root==null) return 0;   
        int lH=height(root.left);
        
        if(lH==-1)
          return -1;
        int rH=height(root.right);
        if(rH==-1)
            return -1;
            
        if(Math.abs(lH-rH)>1) return -1;
        
        return 1+Math.max(lH,rH);
        
        
    }
}