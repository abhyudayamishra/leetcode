class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0,ones = 0,two = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }else if(nums[i]==1){
                ones++;
            }else{
                two++;
            }
        }
        for(int i =0;i<zeros;i++){
            nums[i] = 0;
        }
        for(int i = zeros;i<zeros+ones;i++){
            nums[i] = 1;
        }
        for(int i = zeros+ones;i<zeros+ones+two;i++){
            nums[i] = 2;
        }
    }
}