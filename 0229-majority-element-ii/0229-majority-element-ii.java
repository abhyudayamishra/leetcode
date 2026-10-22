class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int el1 =Integer.MIN_VALUE,count1=0;
        int el2 =Integer.MIN_VALUE,count2=0;
        for(int i =0;i<nums.length;i++){
            if(count1 == 0 && nums[i]!=el2){
                el1 = nums[i];
                count1++;
            }else if(count2 == 0 && nums[i]!=el1){
                el2 = nums[i];
                count2++;
            }else if(nums[i] == el1){
                count1++;
            }else if(nums[i] == el2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;count2=0; 
        for(int i =0;i<nums.length;i++){
            if(nums[i] == el1){
                count1++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] == el2){
                count2++;
            }
        }
        if(count1>nums.length/3){
            ans.add(el1);
        }
        if(count2>nums.length/3 && el1!= el2){
            ans.add(el2);
        }
        if(ans.size()==2 && ans.get(0)>ans.get(1)){
            int temp = ans.get(0);
            ans.set(0 , ans.get(1));
            ans.set(1, temp);
        }
        return ans;
    }
}
