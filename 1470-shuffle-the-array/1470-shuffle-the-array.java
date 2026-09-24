class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray=new int[nums.length];
        int i=0;
        int j=nums.length/2;
        for(int m=0;m<newArray.length;m++){
          if(m%2==0){
            newArray[m]=nums[i];
            i++;
          }
          else{
            newArray[m]=nums[j];
            j++;
          }
         
        }
        return newArray;
    }
}