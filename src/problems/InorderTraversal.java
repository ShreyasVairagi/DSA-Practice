package problems;

import binarytree.TreeNode;

public class InorderTraversal {
    public static void inorder(TreeNode root){
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
