package problems;

import binarytree.TreeNode;

public class SumOfNodesBinaryTree {
    public static int sumNodes(TreeNode root){
        if (root == null) {
            return 0;
        }

        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);

        return leftSum + rightSum + root.data;
    }
}
