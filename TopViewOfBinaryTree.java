package TreesProb;
import java.util.*;

public class TopViewOfBinaryTree {
    public ArrayList<Integer> topView(TreeNode root) {
        // code here
        List<List<Integer>> traversal = verticalTraversal(root);
        ArrayList<Integer> ans = new ArrayList<>();

        for(List<Integer> lst : traversal){
            ans.add(lst.get(0));
        }

        return ans;
    }

        public List<List<Integer>> verticalTraversal(TreeNode root) {
           Queue<Triplets> qu = new LinkedList<>();
           TreeMap<Integer,List<int[]>> tMap = new TreeMap<>();
           qu.add(new Triplets(root, 0, 0));

           while (!qu.isEmpty()) {
              Triplets tri = qu.poll();

                // Add [row, val] to the column's list
                if (!tMap.containsKey(tri.col)) {
                    tMap.put(tri.col, new ArrayList<>());
                }
                tMap.get(tri.col).add(new int[]{tri.row,tri.node.val});


                if(tri.node.left != null)
                    qu.add(new Triplets(tri.node.left, tri.row+1, tri.col-1));

                if(tri.node.right != null)
                    qu.add(new Triplets(tri.node.right, tri.row+1, tri.col+1));
           }


           List<List<Integer>> ans = new ArrayList<>();
           for(List<int[]> lst : tMap.values()){
               // Sort by row first, then by val
               Collections.sort(lst, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

               List<Integer> temp = new ArrayList<>();
               for(int[] pairs : lst){
                   temp.add(pairs[1]);
               }

               ans.add(temp);
           }

           return ans;
    }
}
