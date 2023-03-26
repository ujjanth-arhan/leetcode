class Trie {

    private Trie[] characters;
    private boolean isEnd;
    public Trie() {
        characters = new Trie[26];
        isEnd = false;
    }
    
    public void insert(String word) {
        Trie iTrie = this;
        for (int i = 0; i < word.length(); i++) {
            int letter = word.charAt(i) - 'a';
            if (iTrie.characters[letter] == null) {
                iTrie.characters[letter] = new Trie();
            }

            iTrie = iTrie.characters[letter];
        }

        iTrie.isEnd = true;
    }
    
    public boolean search(String word) {
        int i = 0;
        int len = word.length();
        Trie iTrie = this;
        for (i = 0; i < len; i++) {
            int letter = word.charAt(i) - 'a';
            if (iTrie.characters[letter] == null) return false;
            iTrie = iTrie.characters[letter];
        }

        if (i == len && iTrie.isEnd) return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        int i = 0;
        int len = prefix.length();
        Trie iTrie = this;
        for (i = 0; i < len; i++) {
            int letter = prefix.charAt(i) - 'a';
            if (iTrie.characters[letter] == null) return false;
            iTrie = iTrie.characters[letter];
        }

        if (i == len) return true;
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */