import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        // My first intution is that i will first insert that interval in the array 
        //then i will merge all the intervals of the new array and will make a 
        // new non overlapping intervals array
        int idx = -1;
        int strt = newInterval[0];
        

        for(int i = 0 ; i < n-1 ; i++){
            int cuStrt = intervals[i][0];
            int nexStrt = intervals[i+1][0];        
            if (cuStrt < strt && strt < nexStrt) {
                idx = i+1;
                break;
            }
        }

        if (idx == -1) {
        if (strt < intervals[0][0]) {
            idx = 0;
        }

        if (strt > intervals[n-1][0]) {
            idx = n;
        }
        }

        int[][] ivals = new int[n+1][2];
        int j = 0;
        for(int i = 0 ; i < ivals.length ; i++){
            if (i == idx) {
                ivals[i] = newInterval;
            }else{
                ivals[i] = intervals[j];
                j++;
            }
        }

        return merge(ivals);
    }

    public int[][] merge(int[][] interval){
        int n = interval.length;
        List<int[]> ans = new ArrayList<>();

        int prevStrt = interval[0][0];
        int prevEnd = interval[0][1];

        for(int i = 1 ; i < n ; i++){
            int cuStrt = interval[i][0];
            int cuEnd = interval[i][1];

            //Overlapping
            if (prevEnd >= cuStrt) {
                prevEnd = Math.max(prevEnd, cuEnd);  //Extending the active window
            }else{   // Non Overlapping condition
                ans.add(new int[]{prevStrt,prevEnd});

                // Update
                prevStrt = cuStrt;
                prevEnd = cuEnd;
            }
        }

        // Adding the last window
        ans.add(new int[]{prevStrt,prevEnd});

        //Converting the list to the 2d array
        int[][] arr = new int[ans.size()][];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = ans.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        
        InsertIntervals ii = new InsertIntervals();
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};

        int[][] ans = ii.insert(intervals, newInterval);

        System.out.println(Arrays.deepToString(ans));
    }
}
