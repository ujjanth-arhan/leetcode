class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int prev1 = nums[0];
        int prev2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int cur = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = cur;
        }

        return Math.max(prev1, prev2);
    }
}