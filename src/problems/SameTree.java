package problems;

import binarytree.TreeNode;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }

        if (p == null || q == null){
            return false;
        }

        if (p.data != q.data) {
            return false;
        }

        boolean leftMatch = isSameTree(p.left, q.left);
        boolean rightMatch = isSameTree(p.right, q.right);

        return leftMatch && rightMatch;

    }
}
