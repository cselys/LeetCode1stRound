public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        java.lang.StringBuffer res=new java.lang.StringBuffer();
        
        int carrier=0;
        
        int ia=a.length()-1;
        int ib=b.length()-1;
        
        
        while(ia>=0 && ib>=0){
            if(a.charAt(ia)==b.charAt(ib))
              {
                if(carrier==0){
                  res.append('0');
                  if(a.charAt(ia)=='1')
                  carrier=1;}
                else{
                  res.append('1');
                  if(a.charAt(ia)=='0') carrier=0;
                  }                    
                }
                
              
            else{
            if(carrier==0){    
              
              res.append('1');}
              else{
              
              res.append('0');}
                  
              }
              ia--;
              ib--;
            }  
            
        while (ia>=0&&ib<0){
                             
              if(carrier==a.charAt(ia)-'0')
            
              res.append('0');
              
            
            else {
                res.append('1');
                carrier=0;
            }
            ia--;
        }
        
        
        while (ia<0&&ib>=0){
            
            if(carrier==b.charAt(ib)-'0')
            {
               res.append('0');               
               
            }
            else {
            
            res.append('1');carrier=0;
            }
                        
            ib--;
        }
        
        
        if(carrier==1) res.append('1');
        return res.reverse().toString();
    }
}