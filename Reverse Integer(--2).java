public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
    
    if(x>=0) 
       {
           StringBuilder strB=new StringBuilder(String.valueOf(x));
       
       return Integer.parseInt(strB.reverse().toString());
       }
    else {
        StringBuilder strB=new StringBuilder((String.valueOf(x)).substring(1));
       
       return Integer.parseInt(strB.reverse().toString())*-1;

        
    }
       
    }
}