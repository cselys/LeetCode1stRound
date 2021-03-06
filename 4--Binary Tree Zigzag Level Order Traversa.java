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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>>  ret=new ArrayList<ArrayList<Integer>> ();
        if(root==null) return ret;
        
        Queue<TreeNode> q1=new LinkedList<TreeNode>();
        Queue<TreeNode> q2=new LinkedList<TreeNode>();
        
        q1.offer(root);
        
        ArrayList<Integer> level=new ArrayList<Integer>();
        
        int i=0;
        while(!q1.isEmpty()){
            TreeNode cur=q1.poll();
            level.add(cur.val);
            
            if(cur.left!=null) q2.offer(cur.left);
            if(cur.right!=null) q2.offer(cur.right);
            
            if(q1.isEmpty()){
                if((i&1)==0) ret.add(level);
                else {
                    Collections.reverse(level);
                    ret.add(level);
                }
                
                Queue<TreeNode> temp=q1;
                q1=q2;
                q2=temp;
                level=new ArrayList<Integer>();
                ++i;
            }
        }
        
        return ret;
    }
}