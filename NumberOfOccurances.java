package BinarySearchProb;

public class NumberOfOccurances {
    int countFreq(int[] arr, int target) {
        // code here
        int lowerBnd = lowerBound(arr, target);
        int upperBnd = upperBound(arr, target);

        if (lowerBnd == -1 || arr[lowerBnd] != target) {   //If not present in the array!!
            return 0;
        }

        int cnt = upperBnd-lowerBnd+1;
        return cnt;

    }

    int upperBound(int[] arr , int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;

        int uBD = -1;

        while (s <= e) {
            int m = s + (e-s)/2;
            if (arr[m] <= target) {
                uBD = m;
                s = m+1;
            }else{
                e = m-1;
            }
        }

        return uBD;
    }

    int lowerBound(int[] arr , int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;

        int lBD = -1;

        while (s <= e) {
            int m = s + (e-s)/2;
            if (arr[m] >= target) {
                lBD = m;
                e = m-1;
            }else{
                s = m+1;
            }
        }

        return lBD;
    }
}
