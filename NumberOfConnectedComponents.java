package GraphsProb;
import java.util.*;


public class NumberOfConnectedComponents {
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        //First i have to make a adjacency list!!!!!
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        //first fill it with empty list!!!!!
        for(int i = 0 ; i < V ; i++){
            adjList.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge : edges){
           int u = edge.get(0);
           int v = edge.get(1);

           adjList.get(u).add(v);
           adjList.get(v).add(u);
        }
        
        int cnt = 0;
        boolean[] visited = new boolean[V];
        for(int i = 0 ; i < V ; i++){
            if (visited[i] == false) {
                bfs(i, visited, adjList);
                cnt++;
            }
        }

        return cnt;
    }

    public void bfs(int node , boolean[] visited , ArrayList<ArrayList<Integer>> adjList){
        Queue<Integer> que = new LinkedList<>();
        que.add(node);
        visited[node] = true;

        while (!que.isEmpty()) {
            int nod = que.poll();

            for(int neigbour : adjList.get(nod)){
                if (visited[neigbour] == false) {
                    visited[neigbour] = true;
                    que.add(neigbour);
                }
            }
        }
    }
}
