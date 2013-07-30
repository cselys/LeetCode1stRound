public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
         Arrays.sort(S);
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ret.add(new ArrayList<Integer>());
        
        int start=0;
        for(int i=0;i<S.length;i++){
            int size=ret.size();
            for(int j=start;j<size;j++){
             ArrayList<Integer> temp=new ArrayList<Integer>(ret.get(j));
             temp.add(S[i]);
             ret.add(temp);
            }
            
            //if(i<S.length-1 && S[i]==S[i+1])
            //start=size;
          //  else 
            start=0;
            
        }
        return ret;
    }
}


http://tech-wonderland.net/blog/leetcode-subset-i-and-ii.html



public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        
        if(S==null) return null;
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
                                     
        for(int i=0;i<S.length;i++){
            ArrayList<ArrayList<Integer>> cur = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> temp:res){
                cur.add(new ArrayList<Integer>(temp));
            }
            
            for(ArrayList<Integer> temp:cur){
                temp.add(S[i]);
            }
            
            ArrayList<Integer> temp1 = new ArrayList<Integer>();
            temp1.add(S[i]);
            cur.add(temp1);
            
            res.addAll(cur);
        }
        res.add(new ArrayList<Integer>());
        return res;
    }
}