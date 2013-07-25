public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return new ArrayList<Integer>();
        //ArrayList<Integer> ret=new ArrayList<Integer>();
        
        return spiral(matrix, 0,0, matrix.length,matrix[0].length);        
    }
    
    
     ArrayList<Integer> spiral(int[][] matrix, int x, int y, int m ,int n){
        ArrayList<Integer> ret= new ArrayList<Integer>();
        
        if(m<=0||n<=0) return ret;
        
        if(m==1 && n==1) {
            ret.add(matrix[x][y]);
            return ret;
        }
        
        for(int i=0;i<n-1;i++) ret.add(matrix[x][y++]);
        for(int i=0;i<m-1;i++) ret.add(matrix[x++][y]);
        if(m>1){
        for(int i=0;i<n-1;i++) ret.add(matrix[x][y--]);}
        if(n>1){
        for(int i=0;i<m-1;i++) ret.add(matrix[x--][y]);}
        
        if(m==1||n==1) ret.addAll(spiral(matrix,x,y,1,1));
        else ret.addAll(spiral(matrix,x+1,y+1,m-2,n-2));
        
        return ret;
    }
}