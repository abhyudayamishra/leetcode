/**
 * // This ismountainArr's API interface.
 * // You should not implement it, or speculate about its implementation
 * interfacemountainArr {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end =mountainArr.length()-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
              start = mid+1;
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
            if(mountainArr.get(leftmid)==target){
                return leftmid;
            }
            else if(mountainArr.get(leftmid)>target){
                leftend=leftmid-1;
            }
            else{
                leftstart=leftmid+1;
            }
        }
          int rightstart=peak;
          int rightend=mountainArr.length()-1;
        while(rightstart<=rightend){
            int rightmid=rightstart+(rightend-rightstart)/2;
            if(mountainArr.get(rightmid)==target){
                return rightmid;
            }
            else if(mountainArr.get(rightmid)>target){
                 rightstart=rightmid+1;
              
            }
            else{
                 rightend=rightmid-1;
            }
        }
        return -1;
    }
    
}