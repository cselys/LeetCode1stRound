public class Solution {
    public int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        HashMap<Integer,Integer> start=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> end=new HashMap<Integer,Integer>();
        int range=0;
        
        for(int i=0;i<num.length;i++){
            int current =num[i];
            if(start.containsKey(current)) continue;
            
            start.put(current,1);
            end.put(current,1);
            
            int left=current, right=current;
            if(start.containsKey(current+1))
            right=current+start.get(current+1);
            
            if(end.containsKey(current-1))
            left=current-end.get(current-1);
            
            int temp=right-left+1;
            
            start.put(left,temp);
            end.put(right,temp);
            range=range>temp?range:temp;
        }
        return range;
    }
}