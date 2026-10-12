class Solution {
    public int missingNumber(int[] nums) {
        int missing=-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
            missing=i;
            break;
            }
        }
        if(missing==-1){
            return nums.length;
        }
        else{
            return missing;
        }
    }
}