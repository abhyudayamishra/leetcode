class Solution {
    public void rotate(int[][] matrix) {
        int k =0;
        int n = matrix.length;
       for(int j =0;j<matrix[0].length;j++){
        for(int i =0;i<matrix.length;i++){
             k = n-i-1;
             if(i<k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k][j];
                matrix[k][j] = temp;
             }
        }
       } 
       for(int i =0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(i<j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
       }
    }
}