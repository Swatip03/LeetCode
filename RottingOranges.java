package GraphsProb;
import java.util.*;


public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        //The bfs algortihm will be applied here
        //as the minimum time will be taken to rot all the oranges
        //This algo works by visiting the neighboring node and 
        //hence we can do simeltaneously

        int n = grid.length;
        int m = grid[0].length;
        //finding the indices of the rotten oranges
        List<int[]> rot = new ArrayList<>();
        int freshCnt = 0;
    
        //Scan the grid
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if (grid[i][j] == 2) {
                    rot.add(new int[]{i,j});
                }else if (grid[i][j] == 1) {
                    freshCnt++;
                }
            }
        }

        Queue<int[]> que = new LinkedList<>();
        //Push all the rotten oranges into the queue
        for(int i = 0 ; i < rot.size() ; i++){
            que.add(new int[]{rot.get(i)[0],rot.get(i)[1]});
        }

        //Now running the bfs level by level
        boolean[][] visited = new boolean[n][m];
        int time = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            int cnt = 0;
            boolean fresh = false;

        while (cnt < size) {
            int[] nod = que.poll();
            int i = nod[0];
            int j = nod[1];
                
            //upward -- direction
            if (i != 0 && grid[i-1][j] == 1 && (visited[i-1][j] == false)) {
                visited[i-1][j] = true;
                que.add(new int[]{i-1,j});
                fresh = true;
                freshCnt--;
            }

            //downward -- direction
            if (i != n-1 && grid[i+1][j] == 1 && (visited[i+1][j] == false)) {
                visited[i+1][j] = true;
                que.add(new int[]{i+1,j});
                fresh = true;
                freshCnt--;
            }

            //left  -- direction
            if (j != 0 && grid[i][j-1] == 1 && (visited[i][j-1] == false)) {
                visited[i][j-1] = true;
                que.add(new int[]{i,j-1});
                fresh = true;
                freshCnt--;
            }

            //right -- direction
            if (j != m-1 && grid[i][j+1] == 1 && (visited[i][j+1] == false)) {
                visited[i][j+1] = true;
                que.add(new int[]{i,j+1});
                fresh = true;
                freshCnt--;
            }
            cnt++;
        }

        if (fresh) {
            time++;
        }
    }

      if (freshCnt > 0) {
        return -1;
      }

        return time;
    }

}
