import java.util.*;

public class HIndex {

    public int hIndex(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        // since the array is already sorted then it means that 
        // all the papers after ith index will be greater citations then the citations[i]
        // What does n - i mean?
       // After sorting in ascending order, at any index i:
       // n - i = number of papers from index i to end — all having citations ≥ arr[i]


        for(int i = 0 ; i < n ; i++){
            if (n-i <= arr[i]) {
                return n-i;
            }
        }

        return 0;
    }
}
