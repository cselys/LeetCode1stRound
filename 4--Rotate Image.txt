public class Solution {
    public void rotate(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iL=matrix.length-1;
        if(iL<1) return;
        
        for(int i=0;i<=iL/2;i++){
            for(int j=i;j<iL-i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[iL-j][i];
                matrix[iL-j][i]=matrix[iL-i][iL-j];
                matrix[iL-i][iL-j]=matrix[j][iL-i];
                matrix[j][iL-i]=temp;
            }
        }
        
    }
}