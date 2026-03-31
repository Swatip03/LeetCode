import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;

        helpr(nums, idx, ans, lst);
        return ans;
    }

    public void helpr(int[] nums, int idx, List<List<Integer>> ans, List<Integer> lst) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        lst.add(nums[idx]);
        helpr(nums, idx + 1, ans, lst);

        lst.remove(lst.size() - 1);
        helpr(nums, idx + 1, ans, lst);
    }

    public static void main(String[] args) {

        Subsets ss = new Subsets();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ans = ss.subsets(nums);
        System.out.println(ans);
    }

}
