class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap();
        int firstIndex = 0, lastIndex = 0;
        int maxLen = 0;
        while(lastIndex < s.length()) {
            char letter = s.charAt(lastIndex);
            if (map.containsKey(letter)) {
                int pos = map.get(letter);
                if (pos < firstIndex) {
                    map.remove(letter);
                }
                else {
                    maxLen = Math.max(maxLen, lastIndex - firstIndex);
                    firstIndex = pos + 1;
                }
            }

            map.put(letter, lastIndex);
            lastIndex++;
        }

        maxLen = Math.max(maxLen, lastIndex - firstIndex);
        return maxLen;
    }
}