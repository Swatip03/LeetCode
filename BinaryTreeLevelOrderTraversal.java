import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    
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

    public void helprLevelOrder(TreeNode root , List<List<Integer>> list ){

        // I have to use a queue and 2d list wisely in order to insert all the element in the list

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(root);
        q1.add(null);

        while (!q1.isEmpty()) {

            TreeNode currNode = q1.remove();
            q2.add(currNode);

            if (currNode == null) {

                if (q1.isEmpty()) {

                    break;
                    
                }
                else{

                    q1.add(null);

                }
                
            }
            else{

                if (currNode.left != null) {

                    q1.add(currNode.left);
                    
                }

                if (currNode.right != null) 

                    q1.add(currNode.right);
                    
                }

            }
  
        }

        // Now taking out all the data from the queue2 into the List

        List<Integer> lst = new ArrayList<>();

        while (!q2.isEmpty()) {

            TreeNode cuNode = q2.remove();

            if (cuNode != null) {

                lst.add(cuNode.val);
                list.add(new ArrayList<>(lst));

            }
            
        }


    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    }
}
