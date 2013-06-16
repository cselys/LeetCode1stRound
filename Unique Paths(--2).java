public class Solution {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
 
               
        int[][] rets=new int[m+2][n+2];
        
        rets[m][n+1]=1;
        
        for(int i=m;i>0;i--){
        for(int j=n;j>0;j--)
        rets[i][j]=rets[i+1][j]+rets[i][j+1];
                
        }
        return rets[1][1];
            
    }
}