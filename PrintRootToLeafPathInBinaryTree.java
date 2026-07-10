package TreesProb;
import java.util.*;


public class PrintRootToLeafPathInBinaryTree {
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        solve(root, ans, lst);
        return ans;
    }

    public void solve(Node root , ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> lst){
        if (root == null) {
            return;
        }

        lst.add(root.data);   //addition of node val

        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<>(lst));
        }else{
             if(root.left != null) solve(root.left, ans, lst);
             if(root.right != null) solve(root.right, ans, lst);
        }

        lst.remove(lst.size()-1);//The backtracking always!!!!!
    }
}
