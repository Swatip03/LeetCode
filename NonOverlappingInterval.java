import java.util.Arrays;

public class NonOverlappingInterval {
    
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        
        // in this case u have to sort the interval array according to end times to get
        //[[1,2],[2,3],[1,3],[3,4]]

        int cnt = 0;
        int prevEnd = intervals[0][1];

        for(int i = 1 ; i < intervals.length ; i++){

            if (prevEnd > intervals[i][0]) {  // Only for the overlap case

                cnt++;     // Count the variation
                
            }else{

                prevEnd = intervals[i][1];

            }

            

        }

        return cnt;
        
    }

    public static void main(String[] args) {
        
        NonOverlappingInterval no = new NonOverlappingInterval();

        int[][] intervals = {{1,2},{2,3}};
        int ans = no.eraseOverlapIntervals(intervals);

        System.out.println(ans);
    }
}
