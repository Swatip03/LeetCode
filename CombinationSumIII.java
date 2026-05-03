import java.util.*;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {   // k ---length of number allowed n ---the target sum
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int idx = 0;
        solve(nums, idx, k, n, result, lst);
        return result;
    }

    public void solve(int[] nums , int idx , int k , int n , List<List<Integer>> result , List<Integer> lst){
           if (idx == nums.length) {
               if (lst.size() == k) {
                  if (n == 0) {
                    result.add(new ArrayList<>(lst));
                  }
               }
               return;
           }

           if (nums[idx] <= n) {
              lst.add(nums[idx]);   // take
              solve(nums, idx+1, k, n-nums[idx], result, lst);
              lst.remove(lst.size()-1);
           }

           solve(nums, idx+1, k, n, result, lst);
    }
}