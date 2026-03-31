import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public void helprSubsets(int[] nums , int idx ,List<List<Integer>> list , List<Integer> lst){

        if (idx >= nums.length) {

            list.add(new ArrayList<>(lst));
            return;
            
        }


        lst.add(nums[idx]);
        helprSubsets(nums, idx+1, list, lst);

        lst.remove(lst.size()-1);
        helprSubsets(nums, idx+1, list, lst);

    }
    
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> lst = new ArrayList<>();

        int idx = 0;

        helprSubsets(nums, idx, list, lst);

        return list;
        
    }


    public static void main(String[] args) {
    
        SubSets ss = new SubSets();

        int[] nums = {1,2,2};

        List<List<Integer>> list = ss.subsets(nums);

        System.out.println(list);

    }
}
