public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iL=numbers.length;
        int[] ret={-1,-1};
        for(int i=0; i<iL-1;i++){
            for(int j=i+1;j<iL;j++){
                if((numbers[i]+numbers[j])==target)
                 {
                     ret[0]=i+1;
                     ret[1]=j+1;
                 }
            }
        }
        
        return ret;
    }
}