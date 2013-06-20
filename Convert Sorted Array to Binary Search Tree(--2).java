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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        return toBST(num,0,num.length-1);
        
    }
    
    TreeNode toBST(int[] num, int begin, int end){
        if(begin>end) return null;
        TreeNode rt=new TreeNode(num[(begin+end)/2]);
        rt.left=toBST(num, begin, (begin+end)/2-1);
        rt.right=toBST(num, (begin+end)/2+1, end);
        return rt;
    }
}