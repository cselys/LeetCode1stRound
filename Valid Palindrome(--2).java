public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s==null) return true;
        s=s.trim();
        s=s.toLowerCase();
        int iL=s.length();        
        if(iL==0||iL==1) return true;
        char[] sA=s.toCharArray();
        
        int i=0;
        int j=iL-1;
        boolean iR=false;
        while(i<j)
        {
            if(!isChar(sA[i])){i++;continue;} 
            if(!isChar(sA[j])){j--;continue;} 
            
            if(i>=iL || j<0 ||j<i) break;
                        
            if(!isMatched(sA[i],sA[j])) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
    
    boolean isChar(char c){
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')) return true;
        return false;
    }
    
    boolean isMatched(char c1, char c2){
        if(c1==c2 || Math.abs(c2-c1)==('a'-'A'))return true;
        return false;
        
    }
}