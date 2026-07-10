package TreesProb;

import java.util.*;

public class BurningTree {
    public int minTime(Node root, int target) {
        // Single BFS → build parent map + find target node + count total nodes
        HashMap<Node, Node> pNmap = new HashMap<>();
        pNmap.put(root, null);

        // for bfs traversal!!!
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);

        Node targetRef = null; // for finding the target node
        int n = 1; // for counting the total nodes

        while (!qu.isEmpty()) {
            int size = qu.size();
            int cnt = 0;

            while (cnt < size) {
                Node curr = qu.poll();

                if (curr.data == target) {
                    targetRef = curr;
                }

                if (curr.left != null) {
                    pNmap.put(curr.left, curr);
                    n++;
                    qu.add(curr.left);
                }

                if (curr.right != null) {
                    pNmap.put(curr.right, curr);
                    n++;
                    qu.add(curr.right);
                }
                cnt++;
            }
        }

        // BFS from target using parent map (same as K distance)
        // Count levels until all nodes are visited → that's your answer
        HashSet<Node> visited = new HashSet<>();
        Queue<Node> que = new LinkedList<>();
        que.add(targetRef);
        visited.add(targetRef);
        int level = 0; // This will gives us the time to burn ie visit all the nodes of the tree from
                       // the target node

        while (!que.isEmpty()) {
            if (visited.size() == n) {
                break;
            }
            int size = que.size();
            int cnt = 0;

            while (cnt < size) {
                Node curr = que.poll();

                if (pNmap.containsKey(curr)) {
                    Node parent = pNmap.get(curr);
                    if (parent != null && !visited.contains(parent)){
                        que.add(pNmap.get(curr));
                        visited.add(pNmap.get(curr));
                    }
                }

                if (curr.left != null && !visited.contains(curr.left)) {
                    que.add(curr.left);
                    visited.add(curr.left);
                }

                if (curr.right != null && !visited.contains(curr.right)) {
                    que.add(curr.right);
                    visited.add(curr.right);
                }
                cnt++;
            }
            level++;
        }

        return level;
    }
}
