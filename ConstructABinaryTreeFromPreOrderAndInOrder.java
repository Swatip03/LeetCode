package TreesProb;

import java.util.HashMap;

public class ConstructABinaryTreeFromPreOrderAndInOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0;
        int inStart = 0;
        int inEnd = inorder.length-1;

       //with hashmap lookup
       //make a map of the inorder values vs indices
       HashMap<Integer,Integer> hMap = new HashMap<>();
       for(int i = 0 ; i < inorder.length ; i++){
          hMap.put(inorder[i], i);
       }

       return solve(preorder, preStart, inorder, inStart, inEnd, hMap);

    }

    public TreeNode solve(int[] preorder , int preStart , int[] inorder , int inStart , int inEnd , HashMap<Integer,Integer> hMap){
          if(inStart > inEnd){
            return null;
          }

          TreeNode root = new TreeNode(preorder[preStart]);

          int rootIdx = hMap.get(root.val);

          int leftSize = rootIdx-inStart;

          root.left = solve(preorder, preStart+1, inorder, inStart, rootIdx-1, hMap);
          root.right = solve(preorder, preStart+leftSize+1, inorder, rootIdx+1, inEnd, hMap);

          return root;
    }

    
}
