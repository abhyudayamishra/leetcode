class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int ArraySum=0;
        for(int i=0;i<nums.length;i++){
            ArraySum = ArraySum+nums[i];
        }
        int Missing = expectedSum - ArraySum;
        return Missing;
    }
}