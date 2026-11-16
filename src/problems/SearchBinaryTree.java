package problems;

import binarytree.TreeNode;

public class SearchBinaryTree {
    public static boolean search(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        }

        boolean foundOnLeft = search(root.left, target);
        boolean foundOnRight = search(root.right, target);

        return foundOnLeft || foundOnRight;
    }
}
