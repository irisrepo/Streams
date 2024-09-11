package com.iris.leetcode.NodeTree;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class InvertBinaryTree {

    // Recursive function to invert the binary tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root; // Return the root after inverting the tree
    }

    // Utility method to print the binary tree (pre-order traversal)
    public void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        InvertBinaryTree solution = new InvertBinaryTree();

        // Example 1
        TreeNode root1 = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        System.out.println("Original Tree (Pre-order): ");
        solution.preOrder(root1); // Output: 4 2 1 3 7 6 9

        TreeNode invertedRoot1 = solution.invertTree(root1);
        System.out.println("\nInverted Tree (Pre-order): ");
        solution.preOrder(invertedRoot1); // Output: 4 7 9 6 2 3 1

        // Example 2
        TreeNode root2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println("\n\nOriginal Tree (Pre-order): ");
        solution.preOrder(root2); // Output: 2 1 3

        TreeNode invertedRoot2 = solution.invertTree(root2);
        System.out.println("\nInverted Tree (Pre-order): ");
        solution.preOrder(invertedRoot2); // Output: 2 3 1
    }
}
