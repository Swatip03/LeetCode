
import java.util.Arrays;


public class CountDaysWithoutMeetings {
    
    // this problem is same as activity selection problem
    // In which the number of days of work and the start and end timings

    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // The concept of merge intervals is applied here
        
        int prevEnd = 0;
        int daysOff = 0;

        for(int i = 0 ; i < meetings.length ; i++){

            if (meetings[i][0] > prevEnd) {

                daysOff = daysOff + (meetings[i][0] - prevEnd-1);
                
            }

            prevEnd = Math.max(prevEnd, meetings[i][1]);

        }

        if (prevEnd < days) {

            daysOff = daysOff + (days-prevEnd);

        }

        return daysOff;

        
    }

    public static void main(String[] args) {
        
        CountDaysWithoutMeetings cd = new CountDaysWithoutMeetings();
        int days = 10;
        int[][] meetings = {{5,7},{1,3},{9,10}};

        int ans = cd.countDays(days, meetings);

        System.out.println(ans);
    }
}
