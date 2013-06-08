public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
      
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(i>=0 && j>=0){
            if(A[i]>B[j]) {A[k--]=A[i--];}
            else {A[k--]=B[j--];}
        }
        
        if(i<0){
            while(j>=0) {
                A[j]=B[j];
                j--;
            }
        }
    
        
    }
}