

public class CheckIfBinaryTreeIsHeightBalancedOrNot {

    public class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){

            this.val = val;
            this.left = null;
            this.right = null;

        }

    }

    public int leftHeight(TreeNode root){

        if (root == null) {

            return 0;
   
        }

        return leftHeight(root.left)+1;

    }

    public int rightHeight(TreeNode root){

        if (root == null) {

            return 0;
            
        }

        return rightHeight(root.right)+1;

    }
    
    public boolean isBalanced(TreeNode root) {

        if (root == null) {

            return true;
            
        }

        if (Math.abs(leftHeight(root)-rightHeight(root)) <= 1) {

            return true;

        }

        return false;

    }
}
