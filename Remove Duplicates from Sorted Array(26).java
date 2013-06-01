public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iSize=A.length;        
        if(iSize<2) return iSize;
        int iNew=0;
        for(int i=1;i<iSize;i++){
            if(A[iNew]!=A[i])
             A[++iNew]=A[i];
        }
        return iNew+1;        
    }
}