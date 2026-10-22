class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> ans = new ArrayList<>();
       for(int i =0;i<nums.length;i++){
        int count = 0;
        for(int j =i;j<nums.length;j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }
        boolean contain = false;
        if(ans.contains(nums[i])){
            contain = true;
        }
        if(count>nums.length/3 && contain == false){
            ans.add(nums[i]);
        }
       }
       return ans; 
    }
}