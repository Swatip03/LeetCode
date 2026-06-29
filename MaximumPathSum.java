package TreesProb;

public class MaximumPathSum {
    
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        pathSum(root, maxSum);

        return maxSum[0];
    }

    public int pathSum(TreeNode root,int[] maxSum){
        if (root == null) {
            return 0;
        }

        //Since paths can be negative so You just want to clamp the value to 0, not return:
        int pLeft = Math.max(0, pathSum(root.left, maxSum));
        int pRight = Math.max(0, pathSum(root.right, maxSum));

        maxSum[0] = Math.max(maxSum[0], root.val+pRight+pLeft);

        return root.val + Math.max(pLeft, pRight);
    }
}
