import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubsetsPart2 {

    public void helprSubSetsWithDup(int idx , int[] nums , List<List<Integer>> list, List<Integer> lst){

        // Base Condition
        if (idx >= nums.length) {

            list.add(new ArrayList<>(lst));
            return;
            
        }

        // Take the element
        lst.add(nums[idx]);
        helprSubSetsWithDup(idx+1, nums, list, lst);

        //Remove that element
        lst.remove(lst.size()-1);
        helprSubSetsWithDup(idx+1, nums, list, lst);

    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        int idx = 0;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(nums);

        helprSubSetsWithDup(idx, nums, list, lst);

        // now removing the duplicate elements from the list 
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i = 0 ;  i < list.size() ; i++){

            set.add(list.get(i));

        }

        // Now converting this set back into the list
        List<List<Integer>> ans = new ArrayList<>();

        for(List<Integer> ls : set){

            ans.add(ls);

        }

        return ans;
        
    }


    public static void main(String[] args) {
        
        SubsetsPart2 ss = new SubsetsPart2();
        

        int[] nums = {4,4,4,1,4};
        List<List<Integer>> ans = ss.subsetsWithDup(nums);

        System.out.println(ans);
    }
}
