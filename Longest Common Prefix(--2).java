public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int iL=strs.length;
        if(iL==0) return "";
        
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<iL;j++){
                if(strs[j].length()<=i || strs[j].charAt(i)!=c) return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}