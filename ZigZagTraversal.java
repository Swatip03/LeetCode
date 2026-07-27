package TreesProb;

import java.util.*;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if (root == null)
            return ans;
        qu.add(root);

        boolean leftToRight = true;

        while (!qu.isEmpty()) {
            int size = qu.size();
            int cnt = 0;
            List<Integer> temp = new ArrayList<>();

            while (cnt < size) { // loop thru only size
                TreeNode curr = qu.poll();
                // add to the temp list
                temp.add(curr.val);
                // push left and right node in the queue
                if (curr.left != null)
                    qu.add(curr.left);
                if (curr.right != null)
                    qu.add(curr.right);
                cnt++;
            }

            if (!leftToRight)
                Collections.reverse(temp);
            
            ans.add(temp);

            if (leftToRight) {
                leftToRight = false;
            } else {
                leftToRight = true;
            }
        }

        return ans;

    }
}
