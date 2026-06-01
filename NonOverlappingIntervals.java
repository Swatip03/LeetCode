import java.util.*;
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int cnt = 0;
        int prevEnd = intervals[0][0];
        for(int i = 1 ; i < n ; i++){
            int cuStrt = intervals[i][0];
            if (prevEnd >= cuStrt) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        NonOverlappingIntervals noi = new NonOverlappingIntervals();
        int[][] interval = {{1,2},{1,2},{1,2}};
        int ans = noi.eraseOverlapIntervals(interval);
        System.out.println(ans);

    }
}
