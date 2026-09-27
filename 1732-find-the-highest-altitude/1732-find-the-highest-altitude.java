class Solution {
    public int largestAltitude(int[] gain) {
        int[] Altitudes = new int[gain.length+1];
        Altitudes[0]=0;
        int sum=0;
        int j=1;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            Altitudes[j]=sum;
            j++;
        }
        int max = Altitudes[0];
        for(int k =0;k<Altitudes.length;k++){
           if(Altitudes[k]>max){
            max=Altitudes[k];
           }
        }
        return max;
    }
}