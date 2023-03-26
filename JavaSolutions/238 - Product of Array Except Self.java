class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answeri = new int[nums.length];
        int[] answerj = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answeri[i] = 1;
            answerj[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            answeri[i] = answeri[i - 1] * nums[i - 1];
        }

        for (int j = nums.length - 2; j >= 0; j--) {
            answerj[j] = answerj[j + 1] * nums[j + 1];
        }
        
        for (int i = 0; i < nums.length; i++) {
            answeri[i] *= answerj[i];
        }

        return answeri;
    }
}