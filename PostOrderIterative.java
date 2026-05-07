import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class PostOrderIterative {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> ans = new ArrayList<>();
          Stack<TreeNode> stk = new Stack<>();
          stk.push(root);

          while (!stk.isEmpty()) {
            TreeNode curr = stk.peek();
            if (curr.left != null) {
                stk.push(curr.left);
                curr.left = null;
            }else{
                if (curr.right != null) {
                    stk.push(curr.right);
                    curr.right = null;
                }

                ans.add(curr.val);
                stk.pop();
            }
          }

          return ans;
    }
}
