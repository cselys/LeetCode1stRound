public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function

        
        for(int i=0;i<board.length;i++){
            HashSet hs=new HashSet();
            for(int j=0;j<board.length;j++){
                if(hs.contains(board[i][j]) && (board[i][j]!='.')) return false;
                hs.add(board[i][j]);
            }
        }
        
       /// hs.clear();
        
        for(int i=0;i<board.length;i++){
                   HashSet hs=new HashSet();
            for(int j=0;j<board.length;j++){
                if(hs.contains(board[j][i]) && (board[j][i]!='.')) return false;
                hs.add(board[j][i]);
            }
        }
        
         for(int i=0;i<board.length;i=i+3){
            for(int j=0;j<board.length;j=j+3){
                      HashSet hs = new HashSet();
                    int count=0;
                for(int m=0;m<3;m++){
                
                    for(int n=0;n<3;n++){
                if(hs.contains(board[i+m][j+n]) && (board[i+m][j+n]!='.')) return false;
                hs.add(board[i+m][j+n]);
            }}}
        }
        return true;
    }
}