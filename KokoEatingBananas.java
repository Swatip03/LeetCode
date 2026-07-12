package BinarySearchProb;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
          Arrays.sort(piles);
          int low = 1;
          int high = piles[piles.length-1];
          int ans = 1;

          //Remember the monotonic relationship: as k increases, takenHr decreases (or stays same).
          while (low <= high) {
            int mid = low + (high-low)/2;

            if (takenHr(piles, mid) <= h) {
                ans = mid;
                high = mid-1; //search in the left half for lower k value
            }else{
                low = mid+1;   //this mid is too slow → need a faster speed hence search in the right half
            }
          }

          return ans;
    }

    public int takenHr(int[] nums , int hourly){
        int totalHr = 0;

        for(int i = 0 ; i < nums.length ; i++){
            totalHr += Math.ceilDiv(nums[i], hourly);
        }
        
        return totalHr;
    }
}
