package GraphsProb;

import java.util.LinkedList;
import java.util.Queue;

public class CountIslands {
     public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if (!visited[i][j] && grid[i][j] == 'L') {
                    bfs(new int[]{i,j}, n, m, visited, grid);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public void bfs(int[] node , int n , int m , boolean[][] visited , char[][] grid){
          Queue<int[]> que = new LinkedList<>();
          que.add(node);
          visited[node[0]][node[1]] = true;

          //for visiting the 8 directions we will use 2 parallel array approach
          int[] dx = {-1,-1,-1,0,0,1,1,1}; //for row
          int[] dy = {-1,0,1,-1,1,-1,0,1}; //for col

          while (!que.isEmpty()) {
            int[] nod = que.poll();
            int i = nod[0];
            int j = nod[1];

            for(int k = 0 ; k < 8 ; k++){
                int newI = i+dx[k];
                int newJ = j+dy[k];

                if ((newI >= 0 && newI < n && newJ >= 0 && newJ < m) && (grid[newI][newJ] == 'L') && (visited[newI][newJ] == false)) {
                    visited[newI][newJ] = true;
                    que.add(new int[]{newI,newJ});
                }
            }

          }
    }
}
