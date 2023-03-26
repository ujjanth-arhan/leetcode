class Solution {
    public boolean isAnagram(String s, String t) {
        int[] anagram = new int[26];
        
        for(int c: s.toCharArray()) {
            anagram[c-97]++;
        }

        for (int c: t.toCharArray()) {
            anagram[c-97]--;
        }

        for(int i: anagram) {
            if (i !=0) {
                return false;
            }
        }

        return true;
    }
}