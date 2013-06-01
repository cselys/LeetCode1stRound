public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = 0;
        int n=A.length;
              for(int i = 0; i < n; i++)
              if (elem != A[i])
              {
                 A[start++] = A[i];
            }             
        return start;
    }
}