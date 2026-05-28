import java.util.*;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
          List<List<Integer>> result = new ArrayList<>();
          int absDiff = Integer.MAX_VALUE;    //lets make it the minimum absolute diff
          int n = arr.length;
          Arrays.sort(arr);

          // I have to find the minimum absolute diff
          // so i will find the value of minimym absolute diff
          for(int i = 0 ; i < n-1 ; i++){
              int diff = arr[i+1]-arr[i];
              absDiff = Math.min(absDiff, diff);
          }

          for(int i = 0 ; i < n-1 ; i++){
             int currDiff = arr[i+1]-arr[i];
             
             if (currDiff == absDiff) {
                List<Integer> lst = new ArrayList<>();
                lst.add(arr[i]);
                lst.add(arr[i+1]);
                result.add(lst);
             }
          }


          return result;
    }

    public static void main(String[] args) {
        
        MinimumAbsoluteDifference mad = new MinimumAbsoluteDifference();
        int[] arr = {40,11,26,27,-20};
        List<List<Integer>> ans = mad.minimumAbsDifference(arr);
        System.out.println(ans);
    }
}
