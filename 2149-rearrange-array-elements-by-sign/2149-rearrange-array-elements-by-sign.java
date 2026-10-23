class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        int i =0;
        int j =0,k=0;
        while(i<pos.size() && j<neg.size()){
            if(k%2==0){
            nums[k] = pos.get(i);
            i++;
            k++;
        }else{
            nums[k] = neg.get(j);
            j++;
            k++;
        }
        }
        while(i<pos.size()){
            nums[k] = pos.get(i);
            i++;
            k++;
        }
        while(j<neg.size()){
            nums[k] = neg.get(j);
            j++;
            k++;
        }
        return nums;
    }
}