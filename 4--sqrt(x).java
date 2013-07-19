public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        double error=0.000001f;
        double high=x;
        double low=0;
        
        while(high-low>error){
        double mid=(high+low)/2;
        if(mid>x/mid)
        high=mid;
        else
        low=mid;
        }
        return (int)Math.floor(high);
    }
}