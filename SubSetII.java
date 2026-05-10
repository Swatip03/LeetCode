import java.util.*;

public class SubSetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int idx = 0;
        List<Integer> lst = new ArrayList<>();
        solve(nums, idx, result, lst);
        return result;
    }

    public void solve(int[] nums ,int idx , List<List<Integer>> result, List<Integer> lst){
           result.add(new ArrayList<>(lst));
           for(int i = idx ; i < nums.length ; i++){
            if(i != idx && nums[i] != nums[i-1]) continue;
            lst.add(nums[i]);
            solve(nums, idx+1, result, lst);
            lst.remove(lst.size()-1);
           }
    }
}

