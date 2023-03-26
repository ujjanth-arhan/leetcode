class Solution {
    private List<List<Integer>> solutions;
    private int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solutions = new ArrayList<List<Integer>>();
        this.candidates = candidates;
        generate(new ArrayList<Integer>(), 0, target);
        return solutions;
    }

    private void generate(List<Integer> curElements, int start, int curTarget) {
        for (int i = start; i < this.candidates.length && curTarget > 0; i++) {
            int ele = candidates[i];
            curElements.add(ele);
            curTarget -= ele;
            generate(curElements, i, curTarget);
            curElements.remove(curElements.size() - 1);
            curTarget += ele;
        }

        if (curTarget == 0) solutions.add(new ArrayList<Integer>(curElements));
    }
}