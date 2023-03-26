class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int num: nums) {
            int value = 1;
            if (map.containsKey(num)) {
                value = map.get(num);
                ++value;                
            }

            map.put(num, value);
        }

        List<Map.Entry<Integer,Integer>> entrySet = map.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .collect(Collectors.toList());

        int i = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while(i < k && i < entrySet.size()) {
            ans.add(entrySet.get(i).getKey());
            i++;
        }

        return ans.stream().mapToInt(j -> j).toArray();
    }
}