public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> t=new ArrayList<Integer>();
            t.add(1);
            if(i>0){
              for(int j=1;j<i;j++){
                  t.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));                  
              }
              t.add(1);
            }            
            ret.add(t);
        }
        return ret;
    }
}