package BinarySearchProb;

public class CapacityToShipPackagesWithinDdays {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int s = max;
        int e = sum;
        int ans = e;  // ← worst case = ship everything in one day

        while (s <= e) {
            int m = s + (e-s)/2;
            int shipDays = getDays(weights, m);
            if (shipDays <= days) {
                ans = m;
                e = m-1;
            }else{
                s = m+1;
            }
        }

        return ans;
    }

    public int getDays(int[] weights, int wtC){
        int n = weights.length;
        int currentLoad = 0;  //// current ship load
        int day = 1;   // always at least 1 day

        for(int i = 0 ; i < n ; i++){
            if (currentLoad + weights[i] <= wtC) {
                // fits in current ship → add it
                currentLoad += weights[i];
            }else{
                 // doesn't fit → new day, start fresh
                day++;
                currentLoad = weights[i];
            }
        }

        return day;
    }
}
