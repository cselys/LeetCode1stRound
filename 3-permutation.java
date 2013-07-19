public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>> ();
        ArrayList<Integer> cal=new ArrayList<Integer>();
        int len=num.length;
        int[] used=new int[len];
        
        per(num,used, len, cal, ret);
        
        return ret;
        
    }
    
    void per(int[] num, int[] used, int len, ArrayList<Integer> cal, ArrayList<ArrayList<Integer>> ret)
    {
        if(cal.size()==len){
             ArrayList<Integer> cal1=new  ArrayList<Integer>(cal);
             ret.add(cal1);
             return;
        }else{
            for(int i=0;i<len;i++){
                if(used[i]==0) {
                    cal.add(num[i]);
                    used[i]=1;                    
                    per(num,used,len,cal,ret);
                    used[i]=0;
                    cal.remove(cal.size()-1);
                }
                
            }
        }
    }
}