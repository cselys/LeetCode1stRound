public class Solution {
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return;
        getNewNodes(root);
  
    }
    
    public TreeNode[] getNewNodes(TreeNode root){
        assert(root!=null);
        TreeNode[] res = new TreeNode[2];
        
        if(root.left!=null){
            TreeNode[] left = getNewNodes(root.left);
            left[1].right=root.right;
            root.left=null;
            root.right=left[0];
        }
        res[0]=root;
        
        if(root.right!=null){
            TreeNode[] right = getNewNodes(root.right);
            res[1]=right[1];
            root.right=right[0];
        }else{
            res[1]=root;
        }
        return res;
    }
}

Iterative Code: DFS or pre-order traversal

public class Solution {
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<TreeNode> toVisit = new Stack<TreeNode>();
        if(root==null) return;
        toVisit.push(root);
        TreeNode prev = null;
        while(!toVisit.isEmpty()){
            TreeNode cur = toVisit.pop();
            if(cur.right!=null)
                toVisit.push(cur.right);
            if(cur.left!=null)
                toVisit.push(cur.left);
            if(prev!=null){
                prev.left=null;
                prev.right = cur;
            }
            prev=cur;
        }
    }
}