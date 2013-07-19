public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iL=A.length;
        int iMin=iL-1;
        for(int i=iL-2;i>=0;i--){
            if(A[i]>=iMin-i) iMin=i;
        }
        return iMin==0;
    }
}