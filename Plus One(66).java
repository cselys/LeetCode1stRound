public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function        
        int iS=digits.length;
        
        if(iS==0) return digits;
                
        int[] digitsNew= new int[iS+1];
        
        int iCarrry=1;
        for(int i=iS-1;i>=0;i--){
            int iSum=digits[i]+iCarrry;
            if (iSum<10) {
                digits[i]=iSum;
                return digits;
            }else{
                digits[i]=0;   
                digitsNew[i+1]=digits[i];
            }
        }
        digitsNew[0]=1;
        return digitsNew;
    }
}