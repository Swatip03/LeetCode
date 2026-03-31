import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 1) {

            return intervals;
            
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> list = new ArrayList<>();
        int prevEnd = intervals[0][1];


        for(int i = 1 ; i < intervals.length ; i++){

            int currStrt = intervals[i][0];

            int[] arr = new int[2];

            if (prevEnd >= currStrt) {

    
                arr[0] = intervals[i-1][0];
                arr[1] = intervals[i][1];

                list.add(arr);

                prevEnd = intervals[i][1];
                
            }
            else{

                arr[0] = currStrt;
                arr[1] = intervals[i][1];

                list.add(arr);


            }

            

        }


        int[][] ans = new int[list.size()][2];

        for(int i = 0 ; i < list.size() ; i++){

            ans[i] = list.get(i);

        }

        return ans;
        
    }

    public static void main(String[] args) {
        
        MergeIntervals mi = new MergeIntervals();

        int[][] intervals = {{1,4},{4,5}};

        int[][] ans = mi.merge(intervals);

        System.out.println(Arrays.deepToString(ans));
    }
}
