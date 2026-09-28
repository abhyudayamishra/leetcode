class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] nums = new int[m][n];
       
        for(int i=0;i<indices.length;i++){
            int row =0;
            int column =0;
             row = indices[i][0];
             column = indices[i][1];
            for(int k=0;k<n;k++){
            nums[row][k] += 1;
        }
        for(int j=0;j<m;j++){
            nums[j][column] += 1;
        }
        }
        
        int Oddvalue=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]%2!=0){
                    Oddvalue++;
                }
            }
        }
        return Oddvalue;
        
    }
}