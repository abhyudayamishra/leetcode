class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left<right){
            int newmax =0;
            if(height[left]<height[right]){
               newmax = height[left]*(right-left);
               if(newmax>max){
                max = newmax;
               }
               left++;
            }
            else if (height[right]<height[left]){
                newmax = height[right]*(right-left);
                if(newmax>max){
                max = newmax;
               }
                right--;
            }
            else{
                newmax = height[left]*(right-left);
                if(newmax>max){
                max = newmax;
               }
               left++;
               
            }
        }
        return max;
    }
}