import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

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
    
    public void helpr(TreeNode root , List<Integer> lst){

        if (root == null) {

            return;
            
        }

        lst.add(root.val);
        helpr(root.left, lst);
        helpr(root.right, lst);


    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> lst = new ArrayList<>();

        helpr(root, lst);


       return lst;
        
    }
}
