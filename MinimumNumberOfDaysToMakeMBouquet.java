public class MinimumNumberOfDaysToMakeMBouquet {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (m*k > n) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        int s = min;
        int e = max;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e-s)/2;
            if (possible(bloomDay, m, k, mid)) {
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }

        return ans;
        
    }

    public boolean possible(int[] bloomDay , int m , int k , int day){
        int n = bloomDay.length;
        int cnt = 0;      // counting the number of flowers
        int mbq = 0;     // counting the number of bouquets
        for(int i = 0 ; i < n ; i++){
            if (bloomDay[i] <= day) {
                cnt++;
            }else{
                mbq+=cnt/k;     // ✅ count bouquets from this group
                cnt=0;
            }
        }

        mbq+=cnt/k;            // count the last bouquets 
        return mbq >= m;
    }
}
