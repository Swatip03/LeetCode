import java.util.*;

public class PreOrderIterativeTraversal {

     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);

        while (!stk.isEmpty()) {
            ans.add(stk.peek().val);
            if (stk.peek().right != null) {
                stk.push(stk.peek().right);
            }
            if (stk.peek().left != null) {
                stk.push(stk.peek().left);
            }
            stk.pop();
        }
           
        return ans;
    }
}