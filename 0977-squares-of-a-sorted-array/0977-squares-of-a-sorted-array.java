class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int nums1[]=new int[nums.length];
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                nums1[k]=nums[i]*nums[i];
                i++;
                k--;
            }
            else{
                nums1[k]=nums[j]*nums[j];
                j--;
                k--;
            }
        }
        return nums1;
    }
}