class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end =nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]){
              start=mid+1;
            }
            else{
                end = mid;
            }
        }
        int peak = start;
        // left side
        int leftstart=0;
        int leftend=peak;
        while(leftstart<=leftend){
            int leftmid=leftstart+(leftend-leftstart)/2;
            if(nums[leftmid]==target){
                return leftmid;
            }
            else if(nums[leftmid]>target){
                leftend=leftmid-1;
            }
            else{
                leftstart=leftmid+1;
            }
        }
          int rightstart=peak;
          int rightend=nums.length-1;
        while(rightstart<=rightend){
            int rightmid=rightstart+(rightend-rightstart)/2;
            if(nums[rightmid]==target){
                return rightmid;
            }
            else if(nums[rightmid]>target){
                 rightend=rightmid-1;
              
              
            }
            else{
                 rightstart=rightmid+1;
                 
            }
        }
        return -1;
    }
    
}
    
