package TreesProb;

public class SymmetricTree {
     public boolean isSymmetric(TreeNode root) {
        
      //iMAgine a mirror is placed at the centre ie the root of the tree
      //then ele of the left subtree should be equal to the right subtree
      //Property of mirror : left becomes right and right becomes left
           if (root == null) {
            return false;
           }

           return findSymmetric(root.left, root.right);
    }


    public boolean findSymmetric(TreeNode left , TreeNode right){
        if (left == null || right == null) {
            return left == right;
        }

        if (left.val != right.val) {
            return false;
        }

        return findSymmetric(left.left, right.right) && findSymmetric(left.right, right.left);
    }
}
