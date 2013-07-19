public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(s==null) return null;
        if(nRows<=1) return s;
        int sz=s.length();
        
                
        StringBuilder sb=new StringBuilder();
        
        int pattern_size=(nRows-1)*2;
        
        for(int i=0;i<sz;i+=pattern_size){
            sb.append(s.charAt(i));            
        }
        
        for(int i=1;i<nRows-1;i++){
            for(int j=i;j<sz; j+=pattern_size){
                sb.append(s.charAt(j));  
                int k=j+pattern_size-2*i;
                if(k<sz) sb.append(s.charAt(k));
            }
        }
        
        
        for(int i=nRows-1;i<sz;i+=pattern_size){
           sb.append(s.charAt(i));            
        }
        
        return sb.toString();
    }
}