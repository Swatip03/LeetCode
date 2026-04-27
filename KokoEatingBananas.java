
public class KokoEatingBananas {

    public int canEatInHr(int[] piles , int k){
        int n = piles.length;
        int hr = 0;
        for(int i = 0 ; i < n ; i++){
            if (piles[i]%k != 0) {
                hr+=piles[i]/k+1;
            }else{
                hr+=piles[i]/k;
            }
        }
        return hr;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int s = 1;         // the minimum availabe value of k
        int e = piles[n-1];
        int ans = e;

        while (s<=e) {
            int mid = s + (e-s)/2;
            int hours = canEatInHr(piles, mid);
            if (hours <= h) {
                ans = mid;       // The possible answer 
                 e = mid-1;       //✅ try smaller speed
            }else{
                s = mid+1;       //Too slow , increase speed
            }
        }

        return ans;
    }
}