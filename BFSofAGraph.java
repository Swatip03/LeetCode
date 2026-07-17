package GraphsProb;
import java.util.*;

public class BFSofAGraph {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();

        ArrayList<Integer> BFS = new ArrayList<>();  //for storing the answer
        Queue<Integer> que = new LinkedList<>();    //for traversal
        Boolean[] visited = new Boolean[n];          //Visited array will track the visited nodes
        que.add(0);
        visited[0] = true;

        while (!que.isEmpty()) {
            int node = que.poll();
            BFS.add(node);

            //Get all adjacent vertices of the node which is removed from queue
            //if a adjacent or neighbour is not visted
            //then visit and push the neighbour into the queue

            for(int neigbour : adj.get(node)){
                if (visited[neigbour] == false) {
                    visited[neigbour] = true;
                    que.add(neigbour);
                }
            }
        }

        return BFS;
    }
}
