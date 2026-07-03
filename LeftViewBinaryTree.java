package TreesProb;
import java.util.*;

public class LeftViewBinaryTree {
    public ArrayList<Integer> leftView(Node root) {
        
        //The left view will be the first element at each level of the level order traversal
        List<List<Integer>> traversal = levelOrder(root);

        ArrayList<Integer> ans = new ArrayList<>();
        
        for(List<Integer> lst : traversal){
            ans.add(lst.get(lst.get(0)));
        }
        
        return ans;
    }

    
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        if(root == null) return ans;
        qu.add(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            int cnt = 0;
            List<Integer> temp = new ArrayList<>();

            while (cnt < size) {   //filling the nodes at each level
                Node curr = qu.poll();
                temp.add(curr.data);
                if(curr.left != null) qu.add(curr.left);
                if(curr.right != null) qu.add(curr.right);
                cnt++;
            }
            ans.add(temp);
        }

        return ans;
    }
}
