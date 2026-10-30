class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            int freq = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], freq);
            maxFreq = Math.max(maxFreq, freq);
        }
        int count = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                count += maxFreq;
            }
        }
        return count;
    }
}