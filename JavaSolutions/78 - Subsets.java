class Solution {
    private List<List<Integer>> solution = new ArrayList<List<Integer>>();
    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {

        this.nums = nums;
        generate(new ArrayList<Integer>(), 0);
        return solution;
    }

    private void generate(List<Integer> curElements, int start) {
        solution.add(new ArrayList<Integer>(curElements));

        for (int i = start; i < nums.length; i++) {
            curElements.add(nums[i]);
            generate(curElements, i + 1);
            curElements.remove(curElements.size() - 1);
        }
    }
}