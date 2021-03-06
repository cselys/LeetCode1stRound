public class Solution {
    

 public boolean solveSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(int k=0;k<9;k++){
                        board[i][j]=(char)('1'+k);
                        if(isValid(board,i,j) && solveSudoku(board)) return true;
                        board[i][j]='.';
                    }
                    return false;
                }
            }
        }
        return true;   
    }
    
    
    boolean isValid(char[][] board, int iL, int jL){
       boolean[] flag=new boolean[9];
       Set<Character> contained=new HashSet<Character>();
       for(int j=0;j<9;j++){
           if(contained.contains(board[iL][j]))return false;
           if(board[iL][j]>'0' && board[iL][j]<='9') contained.add(board[iL][j]);
       }
       
       contained = new HashSet<Character>();
       for(int j=0;j<9;j++){
           if(contained.contains(board[j][jL]))return false;
           if(board[j][jL]>'0' && board[j][jL]<='9') contained.add(board[j][jL]);
       }
       
       contained = new HashSet<Character>();
       for(int m=0;m<3; m++){
           for(int n=0;n<3;n++){
               int x=iL/3*3+m, y=jL/3*3+n;
               if(contained.contains(board[x][y]))return false;
           if(board[x][y]>'0' && board[x][y]<='9') contained.add(board[x][y]);
               
           }
       }
       
        return true;
    }
}