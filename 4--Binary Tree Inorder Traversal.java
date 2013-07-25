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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res = new ArrayList<Integer>();
            if(root==null) return res;
            
            Stack<TreeNode> s = new Stack<TreeNode>();
            
            TreeNode cur=root;
            while(!s.isEmpty() || cur!=null){
                if(cur!=null){
                    s.push(cur);
                    cur=cur.left;
                }else{
                    cur=s.pop();
                    res.add(cur.val);
                    cur=cur.right;
                }
            }
            return res;
    }
}