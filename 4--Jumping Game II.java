public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iL=A.length;
        int curMax=0,nextMax=0, ret=0;
        
        for(int i=0;i<iL;i++){
            if(i>curMax){
                curMax=nextMax;
                ret++;
            }
            nextMax=Math.max(nextMax, A[i]+i);
        }
        return ret;
    }
}



http://coderuo.blogspot.com/2013/05/leetcode-jump-game-ii-in-java.html

http://www.cnblogs.com/lichen782/p/leetcode_Jump_Game_II.html

