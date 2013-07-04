public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>();
        if(num.length<3) return ret; 
        Arrays.sort(num);
        for(int m=0;m<num.length-2;m++){
            if(m==0 || num[m]>num[m-1]){
           int i=m+1;
            int j=num.length-1;
            while(i<j){
                if(num[i]+num[j]==-num[m]){
                    ArrayList<Integer> tmp=new ArrayList<Integer>();
                    tmp.add(num[m]);
                    tmp.add(num[i]);
                    tmp.add(num[j]);
                    ret.add(tmp);
                    j--;
                    i++;
                    while(j>i && num[j]==num[j+1])j--;
                    while(j>i && num[i]==num[i-1])i++;
                    
                }else if(num[i]+num[j]>-num[m]){
                    j--;
                }else {
                    i++;
                }
                
            }
        }
        
    }
        return ret;
    }
}