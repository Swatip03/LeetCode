package TreesProb;

import java.util.*;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // i am storing the level order traversal as the output for the string
        Queue<TreeNode> qu = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        qu.add(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            int cnt = 0;

            while (cnt < size) {
                TreeNode curr = qu.poll();
                cnt++;
                if (curr == null) {
                    sb.append('#').append(',');
                    continue; // skip pushing children for null nodes!
                }

                sb.append(curr.val).append(',');
                if (curr.left != null) {
                    qu.add(curr.left);
                } else {
                    qu.add(null);
                }

                if (curr.right != null) {
                    qu.add(curr.right);
                } else {
                    qu.add(null);
                }
                
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       String[] values = data.split(",");
       TreeNode root = new TreeNode(Integer.parseInt(values[0]));
       Queue<TreeNode> qu = new LinkedList<>();
       qu.add(root);
       int idx = 1;

       while(!qu.isEmpty()){
        TreeNode curr = qu.poll();

        //assign the left child
        if(values[idx] != "#"){
            curr.left = new TreeNode(Integer.parseInt(values[idx]));
            qu.add(curr.left);
        }
        idx++;

        //assign the right child
        if(values[idx] != "#"){
            curr.right = new TreeNode(Integer.parseInt(values[idx]));
            qu.add(curr.right);
        }
        idx++;
       }

       return root;
    }

}
