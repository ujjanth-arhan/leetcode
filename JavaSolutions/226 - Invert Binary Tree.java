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
    public TreeNode invertTree(TreeNode root) {
        TreeNode head = root;
        if (root == null) return root;
        invert(root);
        return head;
    }

    private void invert(TreeNode node) {
        if (node == null) return;
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        invert(node.left);
        invert(node.right);
    } 
}