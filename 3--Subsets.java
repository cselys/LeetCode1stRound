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