class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        int sum=0;
        for(int i=0;i<runningSum.length;i++){
            runningSum[i]=nums[i]+sum;
            sum=sum+nums[i];
        }
        return runningSum;
        
    }
}