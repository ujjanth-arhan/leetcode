class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(maxRob(0, nums.length - 1, nums), maxRob(1, nums.length, nums));
    }

    private int maxRob(int start, int end, int[] nums) {
        int fir = 0;
        int sec = nums[start];

        for (int i = start + 1; i < end; i++) {
            int max = Math.max(fir + nums[i], sec);
            fir = sec;
            sec = max;
        }

        return Math.max(fir, sec);
    }
}