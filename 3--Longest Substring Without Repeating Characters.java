public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int iLen=s.length();
        int i=0,j=0,imax=0;
        
        
        boolean[] chas=new boolean[256];
        
        while(j<iLen){
            if(chas[s.charAt(j)]){
                imax=Math.max(imax,j-i);
                while(s.charAt(i)!=s.charAt(j)) {
                    chas[s.charAt(i)]=false;
                    i++;
                }
                i++;
                j++;
                
            }else{
                chas[s.charAt(j)]=true;
                j++;
            }
            
        }
        return Math.max(imax,iLen-i);
    }
}