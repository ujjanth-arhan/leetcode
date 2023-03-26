class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> numGroup = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            numGroup.put(nums[i], 0);
        }
        
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int len = 0;
            int num = nums[i];
            if (numGroup.containsKey(num - 1)) continue;
            while(numGroup.containsKey(num)) {
                num++;
                len++;
            }

            maxLen = maxLen < len? len: maxLen;
            len = 0;
        }

        return maxLen;
    }
}