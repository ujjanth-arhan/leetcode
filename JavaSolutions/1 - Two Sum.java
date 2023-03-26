class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int dif = target - num;
            if (map.containsKey(dif)) {
                return new int[] {i, (int)map.get(dif)};
            }
            
            map.put(num, i);
        }

        return new int[] {-1, -1};
    }
}