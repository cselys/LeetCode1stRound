public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> prev = new ArrayList<ArrayList<Integer>>();
        prev.add(new ArrayList<Integer>());
        return combinationSum(candidates,target,0,prev);
        
    }
    
   ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target,  int start, ArrayList<ArrayList<Integer>> prev){
ArrayList<ArrayList<Integer>> res = new  ArrayList<ArrayList<Integer>>();
        if(target==0){
            for(ArrayList<Integer> temp:prev){
                ArrayList<Integer> temp1 = new ArrayList<Integer>(temp);   
                res.add(temp1);
            }    
            return res;
        }    
         
          for(int j=start;j<candidates.length;j++){
              if(target<candidates[j]) break;
              for(ArrayList<Integer> temp:prev)
                  temp.add(candidates[j]);
                  ArrayList<ArrayList<Integer>> next = combinationSum(candidates,target-candidates[j],j,prev);                  
              
          if(next.size()>0)
                    res.addAll(next);
            for(ArrayList<Integer> temp:prev)
                temp.remove(temp.size()-1);
          }
     return res;       
            
    }
    
}