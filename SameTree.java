import java.util.ArrayList;
import java.util.List;

public class SameTree {

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

            lst.add(Integer.MIN_VALUE);
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
    
    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> lst1 = preorderTraversal(p);
        List<Integer> lst2 = preorderTraversal(q);

        boolean isSame = true;

        if (lst1.size() != lst2.size()) {

            return false;
            
        }

        for(int i = 0 ; i < lst1.size() ; i++){

            if (!lst1.get(i).equals(lst2.get(i))) {

                isSame = false;
                break;
                
            }


        }

        return isSame;

  
    }


}
