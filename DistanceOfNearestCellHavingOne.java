package GraphsProb;
import java.util.*;

public class DistanceOfNearestCellHavingOne {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        //This problem is same as the rotten oranges where we
        //have to carry out the bfs from different sources
        
        //since we have to find the nearest cell having one 
        //we will start counting distance from the cells having 1

        int[][] ans = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        ArrayList<int[]> cell1 = new ArrayList<>();

        for(int i = 0 ; i < n  ; i++){
            for(int j = 0 ; j < m ; j++){
                if (grid[i][j] == 1) {
                    cell1.add(new int[]{i,j});
                }
            }
        }

        Queue<int[]> que = new LinkedList<>();
        for(int i = 0 ; i < cell1.size() ; i++){
            que.add(new int[]{cell1.get(i)[0],cell1.get(i)[1],0});
        }
        
        int[] dx = {-1,0,0,1};
        int[] dy = {0,-1,1,0};

        while (!que.isEmpty()) {
        
            int cnt = 0;
            int size = que.size();

            while (cnt < size) {
                 int[] nod = que.poll();
                 int i = nod[0];
                 int j = nod[1];
                 int dis = nod[2];
                 ans[i][j] = dis;

                 for(int k = 0 ; k < 4 ; k++){
                    int newI = dx[k]+i;
                    int newJ = dy[k]+j;

                    if ((newI >= 0 && newI < n && newJ >= 0 && newJ < m) && (visited[newI][newJ] == false) && grid[newI][newJ] == 0) {
                        visited[newI][newJ] = true;
                        que.add(new int[]{newI,newJ,dis+1});
                    }
                 }

                cnt++;
            }
        }


        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0 ; j < m ; j++){
                row.add(ans[i][j]);
            }
            result.add(row);
        }

        return result;
    }

    
}
