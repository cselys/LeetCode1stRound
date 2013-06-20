public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A==null || A.length==0) target=0;
        int iL=A.length;
        return search(A,target,0,iL-1);
        
    }
    
    int search(int[] A, int target, int s, int e){                
        if(A[e]<target) return e+1;
        
        if(A[s]>target && s!=e) return s;
        
        if(s>=e) return e;
        int half=(s+e)/2;
        if(A[half]==target) return half;
        else if(A[half]<target) return search(A,target,half+1,e);
        else if(A[half]>target) return search(A,target,s,half-1);
        return 0;

    }
}