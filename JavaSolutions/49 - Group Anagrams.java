class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> maps = new HashMap();
        for (String s: strs) {
            String key = Arrays.toString(getHashMap(s));
            if (maps.containsKey(key)) {
                maps.get(key).add(s);
                continue;
            }
            
            List<String> value = new ArrayList();
            value.add(s);
            maps.put(key, value);
            
        }
        
        List<List<String>> result = new ArrayList();        
        result.addAll(maps.values());

        return result;
    }

    public int[] getHashMap(String s) {
        int[] map = new int[26];
        for(int c: s.toCharArray()) {
            map[c - 97] += 1; 
        }

        return map;
    }
}