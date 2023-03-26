/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int longestTravel = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root, 0);
        return longestTravel;
    }

    private int depth(TreeNode node, int len) {
        if (node == null) return len;
        len++;
        int lLen = depth(node.left, len);
        int rLen = depth(node.right, len);
        longestTravel = Math.max(longestTravel, lLen -len + rLen - len);
        return lLen < rLen? rLen: lLen;
    }
}