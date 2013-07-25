public class Solution {  
    public ArrayList<Integer> spiralOrder(int[][] matrix) {  
        // Start typing your Java solution below  
        // DO NOT write main() function  
          
        ArrayList<Integer> res = new ArrayList<Integer>();  
        int m = matrix.length;  
        if(m<1) return res;  
        int n = matrix[0].length;  
        int top = 0, bottom = m-1, left = 0, right = n-1;  
          
        int loop = m<n ? m : n;  
        loop = (loop+1)/2;  
          
        for( int i=0; i<loop; i++) {  
              
            for(int j=left; j<=right; j++) {  
                res.add( matrix[top][j] );  
            }  
            top++;  
              
            if(top>bottom) return res;  
            for(int j=top; j<=bottom; j++) {  
                res.add( matrix[j][right] );  
            }  
            right--;  
              
            if(left>right) return res;  
            for(int j=right; j>=left; j--) {  
                res.add( matrix[bottom][j] );  
            }  
            bottom--;  
              
            if(top>bottom) return res;  
            for(int j=bottom; j>=top; j--) {  
                res.add( matrix[j][left] );  
            }  
            left++;  
        }  
          
        return res;  
    }  
}  