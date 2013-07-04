public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iL=prices.length;
        int imax=0;
        int imin=Integer.MAX_VALUE;
        for(int i=0;i<iL;i++){
            imax=Math.max(imax,prices[i]-imin);
            imin=Math.min(imin,prices[i]);
        }
        return imax;
    }
}