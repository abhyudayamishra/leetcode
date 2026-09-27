class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flip = new int[image.length][image[0].length];
        for(int row=0;row<image.length;row++){
            int i=0;
            for(int column=image[row].length-1;column>=0;column--){
                flip[row][i]=image[row][column];
                i++;
            }
            
        }
        for(int i=0;i<flip.length;i++){
           for(int j=0;j<flip[i].length;j++){
            if(flip[i][j]==0){
                flip[i][j]=1;
            }
            else{
                flip[i][j]=0;
            }
           }
        }
        return flip;
    }
}