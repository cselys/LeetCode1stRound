public class Solution {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
      char[] cS=s.toCharArray();
      int iL=s.length();
      int ret=0;
      for(int i=0;i<iL;i++){
          if(i+1<iL){
              if(toNum(cS[i])<toNum(cS[i+1])) ret-=toNum(cS[i]);
              else ret+=toNum(cS[i]);
          }else
          ret+=toNum(cS[i]);
      }
      return ret;
    }
    
    int toNum(char c)    
    {    
        switch(c)    
        {    
            case 'I':    
                return 1;    
            case 'V':    
                return 5;    
            case 'X':    
                return 10;    
            case 'L':    
                return 50;    
            case 'C':    
                return 100;    
            case 'D':    
                return 500;    
            case 'M':    
                return 1000;    
            default:    
                return 0;    
        }    
    }   
}