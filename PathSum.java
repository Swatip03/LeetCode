package TreesProb;

public class PathSum {
     public boolean hasPathSum(TreeNode root, int targetSum) {
        //When u reach the leaf node then the root.val should be equal to the target Sum
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                return true;
            }else{
                return false;
            }
         }

        boolean leftPath = hasPathSum(root.left, targetSum-root.val);
        boolean rightPath = hasPathSum(root.right, targetSum-root.val);

        return leftPath || rightPath;
    }
}
