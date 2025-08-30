package leetcode;

public class DiameterOfTree {

    // Definition for a binary tree node
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Diameter at this node is sum of left and right heights
        int diameterAtNode = leftHeight + rightHeight;
        maxDiameter = Math.max(maxDiameter, diameterAtNode);

        // Height of this node is max of left/right + 1
        return 1 + Math.max(leftHeight, rightHeight);
    }
}