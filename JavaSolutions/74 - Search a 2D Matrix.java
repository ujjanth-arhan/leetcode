class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int front = 0;
            int rear = matrix[0].length - 1;
            int iMid = 0;
            do {
                iMid = (front + rear) / 2;
                if (matrix[i][iMid] == target) return true;
                if (target < matrix[i][iMid]) rear = iMid - 1;
                else front = iMid + 1;
            } while(front <= rear);
        }

        return false;
    }
}