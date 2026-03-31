import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {

    
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

    public void helpr(TreeNode root ,  List<Integer> lst){

        if (root == null) {

            return;
            
        }

        helpr(root.left, lst);
        helpr(root.right, lst);
        lst.add(root.val);
        
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {

        
        List<Integer> lst = new ArrayList<>();

        helpr(root, lst);


       return lst;
        
    }
}
