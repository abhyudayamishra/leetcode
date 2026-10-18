class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi =0;
         int one =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                one++;
                maxi = Math.max(one,maxi);
            }
            else{
              one = 0;
            }   
        }
        return maxi;
    }
}