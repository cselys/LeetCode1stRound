public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A==null || A.length<=2) return A.length;
        
        int cur=0;
        boolean bFlag=false;
        for(int i=1;i<A.length;i++){
            if(A[cur]!=A[i]){bFlag=false;A[++cur]=A[i];}
            else if(!bFlag) {bFlag=true;A[++cur]=A[i];}
           
        }
        return cur+1;
    }
}