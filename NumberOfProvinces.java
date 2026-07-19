package GraphsProb;
import java.util.*;


public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        //first i will make the adjacency list
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i <= n ; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if ((i != j) && (isConnected[i][j] == 1)) {
                    adjList.get(i+1).add(j+1);
                }
            }
        }

        //now for counting the provinces
        int cnt = 0;
        boolean[] visited = new boolean[n+1];
        for(int i = 1 ; i <= n ; i++){
            if (visited[i] == false) {
                bfs(i, visited, adjList);
                cnt++;
            }
        }

        return cnt;
    }

    public void bfs(int node , boolean[] visited , List<List<Integer>> adjList){
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
