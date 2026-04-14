import java.util.*;

public class InOrderIterative {

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
    public List<Integer> inorderTraversal(TreeNode root) {
          List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if(root == null){
            return ans;
        }
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode cuNode = stk.peek();
            if (cuNode.left != null) {
                stk.push(cuNode.left);
                cuNode.left = null;       // Mark it visited by making its left to be null
            }else{
                ans.add(cuNode.val);
                stk.pop();
                if (cuNode.right != null) {
                    stk.push(cuNode.right);
                }
                
            }
        }    
        
        return ans;
        
    }
}
