package TreesProb;

import java.util.HashMap;

public class ConstructABinaryTreeFromInOrderAndPostOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int postEnd = postorder.length-1;
        int inStart = 0;
        int inEnd = inorder.length-1;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++){
            hmap.put(inorder[i],i);
        }

        return solve(inorder, inStart, inEnd, postorder, postEnd, hmap);
    }

    public TreeNode solve(int[] inorder , int inStart , int inEnd , int[] postorder , int postEnd ,HashMap<Integer,Integer> hmap ){
        if(inStart > inEnd){
            return null;
         }

         TreeNode root = new TreeNode(postorder[postEnd]);
         int rootIdx = hmap.get(root.val);

         int rightSize = inEnd-rootIdx;

         root.right = solve(inorder,rootIdx+1, inEnd, postorder, postEnd-1, hmap);
         root.left = solve(inorder, inStart, rootIdx-1, postorder, postEnd-(rightSize+1), hmap);

         return root;
    }
}
