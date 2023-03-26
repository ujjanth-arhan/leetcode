class Solution {
    public int search(int[] nums, int target) {
        int front = 0, rear = nums.length - 1, tIndex = 0;

        do {
            tIndex = (front + rear) / 2;            
            if (nums[tIndex] == target) return tIndex;
            if (target < nums[tIndex]) {
                rear = tIndex - 1;
            }
            else {
                front = tIndex + 1;
            }
        } while(front <= rear);

        return -1;
    }
}