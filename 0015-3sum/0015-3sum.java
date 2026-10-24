class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(nums);
         for(int i = 0;i<nums.length-1;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1,k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    ArrayList<Integer> sum = new ArrayList<>();
                    sum.add(nums[i]);
                    sum.add(nums[j]);
                    sum.add(nums[k]);
                    ans.add(sum);
                    k--;
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                         j++;
                    }
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
            }
         }
         return ans;
    }
}