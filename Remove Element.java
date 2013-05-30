public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iSize=A.length;
        if(iSize==1)
        {
            if(A[0]==elem)return 0;
            return iSize;
        }
        for(int i=0;i<iSize;i++){
            int j=1;
            if(A[i]==elem){               
                while(A[iSize-j]==elem)
                {
                    if((iSize-j)==i) return i;
                    j++;                    
                }
                int iTmp=A[i];
                A[i]=A[iSize-j];
                A[iSize-j]=iTmp;               
                iSize=iSize-j;
            }     
              
        }
        return iSize;
        
    }
}