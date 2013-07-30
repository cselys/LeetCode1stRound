
public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function        
        //Arrays.sort( num );
        ArrayList<ArrayList<Integer>> rel = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        rel.add(temp);
        
        Arrays.sort( num );
        subsetsRec(rel, temp, num, 0); 
        
        return rel;
    }
    
    private void subsetsRec(ArrayList<ArrayList<Integer>> rel, ArrayList<Integer> temp, int[] num, int level){
        
        
        for(int i=level; i<num.length; i++) {
            temp.add( num[i] );
            rel.add( new ArrayList<Integer>(temp)  );
            
            subsetsRec(rel, temp, num, i+1);
            
            temp.remove(temp.size() -1);
            
            while(i<num.length-1 && num[i] == num[i+1] ) i++;
            
        }
        
        if(level == num.length - 1) return;
    }
}