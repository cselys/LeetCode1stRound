 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i],i);
        return buildTree(map,preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    
    public TreeNode buildTree(HashMap<Integer, Integer> map, int[] preorder, int[]inorder, int a, int b, int c, int d){
        if(b<a || d<c) return null;
        TreeNode root = new TreeNode(preorder[a]);
        int i = map.get(preorder[a]);
        root.left = buildTree(map, preorder, inorder, a+1,a+i-c,c,i-1);
        root.right = buildTree(map, preorder, inorder, a+i+1-c,b,i+1,d);
        return root;