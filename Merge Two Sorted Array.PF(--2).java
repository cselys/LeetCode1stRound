public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int i = m-1,
            j = n-1,
            k = m+n-1;        
        while(k>=0){
            if(j<0 || (i>=0 && A[i]>B[j]))
                A[k--]=A[i--];
            else
                A[k--]=B[j--];
        }
    }
}