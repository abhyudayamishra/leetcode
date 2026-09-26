class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i=0;i<index.length;i++){
            int indexValue = index[i];
          
                for(int j = target.length-1;j>indexValue;j--){
                    target[j] = target[j-1];
                }
            
               target[indexValue] = nums[i];
        }
        return target;
    }
}