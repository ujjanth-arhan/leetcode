class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] arr1 = new int[nums.length-1];
        int[] arr2 = new int[nums.length-1];
        System.arraycopy(nums, 0, arr1, 0, nums.length - 1);
        System.arraycopy(nums, 1, arr2, 0, nums.length - 1);

        return Math.max(maxRob(arr1), maxRob(arr2));
    }

    private int maxRob(int[] nums) {
        int fir = 0;
        int sec = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int max = Math.max(fir + nums[i], sec);
            fir = sec;
            sec = max;
        }

        return Math.max(fir, sec);
    }
}