package GraphsProb;
import java.util.*;


public class DFSofAGraph {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i =  0 ; i < n ; i++){
           if (!visited[i]) {
            dfsHelpr(i, adj, visited, result);
           }
        }

        return result;
    }

    public void dfsHelpr(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> result ){
        visited[node] = true;
        result.add(node);

        for(int neigbour : adj.get(node)){
            if (!visited[neigbour]) {
                dfsHelpr(neigbour, adj, visited, result);
            }
        }
    }
}
