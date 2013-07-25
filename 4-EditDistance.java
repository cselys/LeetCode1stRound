public class Solution {
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=word1.length();
        int n=word2.length();
        
        int[][] dp=new int [m+1][n+1];
        
        dp[0][0]=0;
        
        for(int i=1;i<=m;i++){
            dp[i][0]=1+dp[i-1][0];
        }
        for(int j=1;j<=n;j++)
            dp[0][j]=1+dp[0][j-1];
            
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                else
                dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
            }
        }
     return dp[m][n];   
    }
}