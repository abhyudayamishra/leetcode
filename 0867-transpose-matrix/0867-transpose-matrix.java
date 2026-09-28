class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        int column = 0;
        for(int i=0;i<matrix.length;i++){
            int row =0;
            for(int j=0;j<matrix[i].length;j++){
                transpose[row][column]=matrix[i][j];
                row++;
            }
            column++;
        }
        return transpose;
    }
}