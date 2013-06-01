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
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return true;
        LinkedList<TreeNode> lt=new LinkedList<TreeNode>();
        LinkedList<TreeNode> rt=new LinkedList<TreeNode>();
        
        lt.add(root.left);
        rt.add(root.right);
        
        while(!lt.isEmpty() && !rt.isEmpty()){
            TreeNode lt1=lt.poll();
            TreeNode rt1=rt.poll();
            
            if(lt1==null && rt1!=null || lt1!=null && rt1==null) return false;
            
            if(lt1!=null){
            if(lt1.val!=rt1.val) return false;
            
            lt.add(lt1.left);
            lt.add(lt1.right);
            rt.add(rt1.right);
            rt.add(rt1.left);
            }
            
        }
        return true;
    }
}