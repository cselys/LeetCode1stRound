public class Solution {

    public static int maxArea(int[] height){
         int maxArea = 0;
         int i = 0;
         int j = height.length - 1;
         if(j <=0)return 0;
         while(i < j) {
             int area = (j-i)*Math.min(height[i],height[j]);
             if(height[i] < height[j]){
                 i++;
                 
             }else {
                 j--;
             }
             if(area > maxArea) maxArea = area;
         }
         return maxArea;
     }

}