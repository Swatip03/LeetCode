import java.util.*;

public class LevelOrderTraversal {

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
    
    public List<List<Integer>> levelOrder(TreeNode root) {

        // The level order traversal can be done by the queue data structure
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        if (root == null) {
            return ans;
        }
        while (!qu.isEmpty()) {
            int levelNum = qu.size();
            List<Integer> lst = new ArrayList<>();     // the list for individual levels
            for(int i = 0 ; i < levelNum ; i++){
                if (qu.peek().left != null) {      // condition for checking if the left tree node is present or not
                    qu.add(qu.peek().left);
                }
                if (qu.peek().right != null) {     // condition for checking if the right tree node is present or not
                    qu.add(qu.peek().right);
                }
                lst.add(qu.poll().val);
            }
            ans.add(lst);
        }
        return ans;
    }

}
}
