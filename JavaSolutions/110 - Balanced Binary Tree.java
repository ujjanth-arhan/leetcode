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
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        depth(root, 0);
        return isBalanced;
    }

    private int depth(TreeNode node, int len) {
        if (node == null) return 0;
        int l1 = depth(node.left, len);
        int l2 = depth(node.right, len);
        if (Math.abs(l1 - l2) > 1) isBalanced = false;
        return l1 > l2? ++l1: ++l2;
    }
}