public class Solution {
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(divisor==0) return -1;

        if(dividend==0) return 0;
        
        int negative=1;
        if(divisor>0&&dividend<0||divisor<0&&dividend>0) negative=-1;
        
        int ret=0;
        
        long ldividend=Math.abs((long)dividend);
        long ldivisor=Math.abs((long)divisor);
        
        while(ldividend>=ldivisor){
        long d=ldivisor;
        int temp=1;
        while(ldividend>d<<1){
        temp<<=1;
        d<<=1;
        }
        ldividend-=d;
        ret+=temp;
        
        }
        
        return ret*negative;
        
    }
}