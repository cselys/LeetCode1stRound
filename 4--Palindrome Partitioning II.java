public class Solution {
    public int minCut(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        boolean[][] isPalindrom=buildTable(s);
        
        int il=s.length();
        int[] cut=new int[il+1];
        cut[il]=0;
        cut[il-1]=1;
        
        for(int i=il-2;i>=0;i--){
            int sum=il+10;
            for(int j=il-1;j>=i;j--){
                if(isPalindrom[i][j])
                sum=Math.min(sum, 1+cut[j+1]);            
            }
            cut[i]=sum;
        }
        
        return cut[0]-1;
        
    }
    
    boolean[][] buildTable2(String s){
        
        int n=s.length();
        boolean[][] isPalindrom=new boolean[n][n];
         boolean[][] map = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            map[i][i] = true;
        }
        for(int l = 2; l <= n; l++){
            for(int j = 0; j + l -1 <= n-1; j++ ){
                if(j+1 <= j+l-2)
                    map[j][j+l-1] = s.charAt(j) == s.charAt(j+l-1) && map[j+1][j+l-2];
                else map[j][j+l-1] = s.charAt(j) == s.charAt(j+l-1);
            }
        }       
        return map;
    }
    
    boolean[][] buildTable(String s){
        
        int len=s.length();
        boolean[][] isPalindrom=new boolean[len][len];
        
        
        
        //for(int i=len-1;i>=0;i--){
          //  for(int j=i+1;j<=len;j++){
            //    if(j-1<0 || i+1>=len) continue;
              //  isPalindrom[i][j]=isPalindrom[i+1][j-1]&&s[i]==s[j];
            //}
        //}
        
        for(int i=0;i<len;i++) isPalindrom[i][i]=true;
        
        for(int i=0;i<len-1;i++) {
            if(s.charAt(i)==s.charAt(i+1))
                isPalindrom[i][i+1]=true;
            
        }
        
        for(int l=3;l<=len;l++){
            for(int i=0;i<=len-l;i++){
                int j=i+l-1;
                if(s.charAt(i)==s.charAt(j) && isPalindrom[i+1][j-1])
                isPalindrom[i][j]=true;
            }
        }
        
       return isPalindrom;
    }
}