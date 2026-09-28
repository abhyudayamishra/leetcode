class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0;
        int j=0;
        while(i<mat.length&&j<mat[0].length){
            sum=sum+mat[i][j];
            i++;
            j++;
        }
        int k=0;
        int l=mat[0].length-1;
        while(k<mat.length&&l>=0){
            if(k!=l){
            sum=sum+mat[k][l];
            }
            k++;
            l--;
        }
        return sum;
    }   
}   
