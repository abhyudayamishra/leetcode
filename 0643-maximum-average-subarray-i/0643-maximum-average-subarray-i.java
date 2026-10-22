class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Integer.MIN_VALUE;
        for(int i =0;i<nums.length-k+1;i++){
            int sum =0;
            for(int j =i;j<i+k;j++){
                sum = sum + nums[j];
            }
            double newavg = (double)sum/k;
            if(newavg>avg){
                avg = newavg;
            }
        }
        return avg;
    }
}
