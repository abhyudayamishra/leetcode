class Solution {
    public int[][] generateMatrix(int n) {
    int[][] arr = new int[n][n];
    int p = arr.length, q = arr[0].length;
    int fr = 0, fc = 0, lr = p-1, lc = q-1;
    int count = 1;
    while(count<=n*n){
    for(int j=fc;j<=lc;j++){
        arr[fr][j] = count;
        count++;
    }
    fr++;
    for(int i=fr;i<=lr;i++){
        arr[i][lc] = count;
        count++;
    }
    lc--;
    for(int j=lc;j>=fc;j--){
        arr[lr][j] = count;
        count++;
    }
    lr--;
    for(int i=lr;i>=fr;i--){
        arr[i][fc] = count;
        count++;
    }
    fc++;
    }
    return arr;
    }
}