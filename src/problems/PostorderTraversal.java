package problems;

import binarytree.TreeNode;

public class PostorderTraversal {
    public static void postorder(TreeNode root){
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
}
