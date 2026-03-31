import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public void permuteRecurr(int[] nums , boolean[] freq , List<List<Integer>> list , List<Integer> lst){

        if (lst.size() == nums.length) {

            list.add(new ArrayList<>(lst));
            return;

        }

        for(int i = 0 ; i < nums.length ; i++){

            if (!freq[i]) {

                freq[i] = true;
                lst.add(nums[i]);
                permuteRecurr(nums, freq, list, lst);
                lst.remove(lst.size()-1);
                freq[i] = false; 
                
            }

        }

    }
    
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        permuteRecurr(nums, freq, list, lst);

        return list;
        
    }

    public static void main(String[] args) {
        
        Permutations pp = new Permutations();

        int[] nums = {1,2,3};
        List<List<Integer>> ans = pp.permute(nums);

        System.out.println(ans);
    }
}
