package problems;

import binarytree.TreeNode;

public class PreorderTraversal {
    public static void preorder(TreeNode root){
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

}
