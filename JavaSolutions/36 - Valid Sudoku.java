class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String, Integer> subGrid = new HashMap();
        for (int i = 0; i < 9; i++) {
            Map<Integer, Integer> row = new HashMap();
            Map<Integer, Integer> col = new HashMap();
            for (int j = 0; j < 9; j++) {

                // Row and column check
                int rowKey = board[i][j] != '.'? Character.getNumericValue(board[i][j]): -1;
                int colKey = board[j][i] != '.'? Character.getNumericValue(board[j][i]): -1;
                int curValue = 1;
                if (rowKey != -1) {
                    if (row.containsKey(rowKey)) {
                        return false;
                    }

                    row.put(rowKey, curValue);
                }

                curValue = 1;
                if (colKey != -1) {
                    if (col.containsKey(colKey)) {
                        return false;
                    }

                    col.put(colKey, curValue);
                }

                // Subgrid check
                if (rowKey != -1 && j >= i) {
                    String subGridKeyPartial = (i / 3) + "" + (j / 3);
                    if (subGrid.containsKey(subGridKeyPartial + "" + rowKey)) {
                        return false;
                    }

                    subGrid.put(subGridKeyPartial + "" + rowKey, 1);
                }

                if (colKey != -1 && j >= i) {
                    String subGridKeyPartial = (j / 3) + "" + (i / 3);
                    if (subGrid.containsKey(subGridKeyPartial + "" + colKey)) {
                        int val = subGrid.get(subGridKeyPartial + "" + colKey);
                        if (val < 2 && i == j) {
                            subGrid.put(subGridKeyPartial + "" + colKey, ++val);
                            continue;
                        }
                        
                        return false;
                    }

                    subGrid.put(subGridKeyPartial + "" + colKey, 1);
                }
            }
        }

        return true;
    }
}