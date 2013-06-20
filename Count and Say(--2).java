public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
          // DO NOT write int main() function
        if(n==1) return "1";
        String strRet="1";
        
        for(int i=2;i<=n;i++){            
            int iL=strRet.length();
            char c=strRet.charAt(0);
            if(iL==1) {strRet="1"+c;continue;}
            String strT="";
            int iCount=1;
            for(int j=1;j<iL;j++){
                if(c==strRet.charAt(j)) iCount++;
                else{
                    strT+=(iCount+""+c);
                    iCount=1;
                    c=strRet.charAt(j);
                }               
            }
             strT+=(iCount+""+c);
            strRet=strT;
        }
        
        return strRet;
    }
}