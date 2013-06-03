public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int preL=0, curL=0;
        char[] chars=s.toCharArray();
        int iL=chars.length;
        
        for(int i=0;i<iL;i++){
            if(chars[i]==' ') {
                if(curL!=0){
                    preL=curL;                
                    curL=0;                
                }
            }else
            curL++;            
        }
        
        if(curL==0) return preL;
        return curL;
    }
}