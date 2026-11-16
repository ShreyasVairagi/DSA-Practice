package problems;

import binarytree.TreeNode;

public class CountLeafNodes {
    public static int countLeaves(TreeNode root){
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int leftLeaves = countLeaves(root.left);
        int rightLeaves = countLeaves(root.right);

        return leftLeaves + rightLeaves;
    }
}
