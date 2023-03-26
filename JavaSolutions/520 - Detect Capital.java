class Solution {
    public boolean detectCapitalUse(String word) {
        int firstLetter = (int)word.charAt(0);
        int i = 1;
        int numUpperCase = 0;
        while(i < word.length()) {
            if (word.charAt(i) < 97) {
                numUpperCase++;
            }
            i++;
        }

        if (firstLetter < 97 && numUpperCase == 0) return true;
        if (firstLetter < 97 && numUpperCase == word.length() - 1) return true;
        if (firstLetter >= 97 && numUpperCase == 0) return true;
        return false;
    }
}