package TreesProb;
import java.util.*;

public class BoundaryTraversal {
    public ArrayList<Integer> boundary(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        //filling of the ans array (The boundary traversal)
        ans.add(root.data);
        leftBoundary(root.left, ans);
        addLeaves(root, ans);
        rightBoundary(root.right, ans);

        return ans;
    }

    //The nodes on the left subtree excluding the leaf nodes!!!(TOP TO BOTTOM APPROACH)
    public void leftBoundary(Node node , ArrayList<Integer> lst){ 
        if(node == null)return;
        if(node.left == null && node.right == null){ //The leaf node!!
            return;
        }

        lst.add(node.data); //add the node value

        if(node.left != null) leftBoundary(node.left, lst); //if the left child is present!!
        else if(node.right != null) leftBoundary(node.right, lst); //if the right child is present
    }

    public void addLeaves(Node node, ArrayList<Integer> lst){
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            lst.add(node.data);
        }

        if(node.left != null) addLeaves(node.left, lst);
        if(node.right != null) addLeaves(node.right, lst);
    }

    //The right boundary excluding the leaf nodes!!!!!!!!!!(BOTTOM TO TOP APPROACH)
    public void rightBoundary(Node node ,ArrayList<Integer> lst){
        if(node == null){
            return;
        }

        if (node.left == null && node.right == null) {       //The leaf node
            return;
        }

        if(node.right != null) rightBoundary(node.right, lst);
        else if(node.left != null) rightBoundary(node.left, lst);

        lst.add(node.data);
    }
}
