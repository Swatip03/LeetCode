package BinarySearchProb;
import java.util.*;
public class AggresiveCows {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);    //sort the array!!!
        int n = arr.length;
        int low = 1;
        int high = arr[n-1]-arr[0]; //ie max-min dis (the maximum distance btw the two cows)
        int ans = 1; //since we want the maximum possible minimum distance btw two cows

        

        //The core idea is that: the minimum distance btw two cows always happened to be in 
        //btw the consecutive cows position in a sorted array
        //Try to place k cows while maintaing some mini distance at each config
        //the mini dist can be searched using the binary search!!
        //check if can place or not by greedily starting placement from first index
        //ie always put first cow at 0th index

        while (low <= high) {
            int mid = low + (high-low)/2;

            if (canPlace(arr, mid, k)) { //if true , then this distance is achievable → try for bigger
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;

    }

    public boolean canPlace(int[] arr , int dist , int k){
        int n = arr.length;
        //Placing first cow at 0th index
        int cowsCnt = 1;
        int lastCwPos = arr[0];   //the placement of last cow

        for(int i = 1 ; i < n ; i++){
            if (arr[i] - lastCwPos >= dist) {
                cowsCnt++;
                lastCwPos = arr[i];
            }
        }

        if (cowsCnt >= k) {
            return true;
        }else{
            return false;
        }

    }
}
