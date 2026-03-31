import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public void helpr(int[] arr , int idx , int target , List<List<Integer>> list , List<Integer> lst ){

        if (idx >= arr.length ) {

            if (target == 0) {

                list.add(new ArrayList<>(lst));
            
            }
            
            return;

        }

        // pick the element and make sure that the element can be as many times
        if (arr[idx] <= target) {

            lst.add(arr[idx]);
            helpr(arr, idx, target-arr[idx], list, lst);
            lst.remove(lst.size()-1);
            
        }
        
        helpr(arr, idx+1, target, list, lst);

        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {



        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        int idx = 0;

        helpr(candidates, idx, target, list, lst);

        return list;

    }

    public static void main(String[] args) {

        CombinationSum cs = new CombinationSum();
        
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> ans = cs.combinationSum(arr, target);

        System.out.println(ans);

    }
}
