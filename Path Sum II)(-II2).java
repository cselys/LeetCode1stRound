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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp= new ArrayList<Integer>();
        GetResult(root,sum,result, tmp);
        return result;
        
    }
    
   void GetResult(TreeNode root, int sum, ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> tmp){
        if(root==null) return;
        
        tmp.add(root.val);
        
        int leftS=sum-root.val;
        
        if(leftS==0 && root.left==null && root.right==null)
        {
            ret.add(tmp);
            return;
        }
        
        GetResult(root.left, leftS, ret,new ArrayList<Integer>(tmp) );
        GetResult(root.right, leftS, ret, new ArrayList<Integer>(tmp) );
        
        //tmp.remove(tmp.size()-1);
    
    }
    
}