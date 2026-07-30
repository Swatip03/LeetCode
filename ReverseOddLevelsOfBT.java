package TreesProb;

public class ReverseOddLevelsOfBT {
    public TreeNode reverseOddLevels(TreeNode root) {
         //The recursive approach!!!
        int level = 1;
        solve(root.left, root.right, level);
        return root;
    }

    public void solve(TreeNode left ,TreeNode right, int level){
          if (left == null) {
              return;
          }

          if (level % 2 != 0) { //if the level is odd
             //swap only the values
             int temp = left.val;
             left.val = right.val;
             right.val = temp;
          }

          //for outer pair swapping!!
          solve(left.left, right.right, level+1);    //assume the first and the last node of the level
          //for inner pair swapping
          solve(left.right, right.left, level+1);    //assume the second and third node of the level
    }
}
