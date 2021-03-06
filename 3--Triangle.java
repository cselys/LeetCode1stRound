public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(triangle==null || triangle.size()==0) return 0;
        
        int[] mins=new int[triangle.size()+1];
        Integer[] array = triangle.get(triangle.size()-1).toArray(new Integer[0]); 
        for(int i=triangle.size()-1;i>=0;i--){
               ArrayList<Integer> row = triangle.get(i); 
            for(int j=0;j<row.size();j++){
                mins[j]=row.get(j)+Math.min(mins[j],mins[j+1]);
            }
        }
        return mins[0];
    }
}