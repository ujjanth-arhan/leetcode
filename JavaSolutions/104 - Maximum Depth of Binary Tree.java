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
    int maxHeight = 0;
    public int maxDepth(TreeNode root) {
        TreeNode head = root;
        depth(root, 0);

        return maxHeight;
    }

    private void depth(TreeNode node, int length) {
        int len = length;
        if (node == null) return;
        len++;
        maxHeight = Math.max(maxHeight, len);
        depth(node.left, len);
        depth(node.right, len);
    }
}