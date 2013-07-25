public class Solution {  
    public int trap(int[] A) {  
        // Start typing your Java solution below  
        // DO NOT write main() function  
          
        int sz = A.length;  
        if(sz<=2) return 0;  
          
        int i=0, j=sz-1, lm=A[0], rm=A[j];  
        int sum = 0;  
          
        while(i<=j) {  
            if(lm<rm) {  
                if(A[i]<lm) {  
                    sum += lm - A[i];  
                } else {  
                    lm = A[i];  
                }  
                ++i;  
            } else {  
                if(A[j]<rm) {  
                    sum += rm - A[j];  
                } else {  
                    rm = A[j];  
                }  
                --j;  
            }  
        }  
          
        return sum;  
    }  
}  