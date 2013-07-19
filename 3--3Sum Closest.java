public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int iL=num.length;
        
        Arrays.sort(num);
        
        int max=num[0]+num[1]+num[2];
        
        for(int i=0;i<iL-2;i++){
            for(int j=i+1, k=iL-1;j<k;){
                int sum=num[i]+num[j]+num[k];
                if(sum==target) return sum;
                if(Math.abs(sum-target)<Math.abs(max-target))
                max=sum;
                if(sum>target)
                k--;
                else
                j++;                
            }
        }
        return max;
    }
}