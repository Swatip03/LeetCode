package ArrayI;
import java.util.*;

public class NextPermutations {
    
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        // Finding the breaking point
        for(int i = 0 ; i < n-1 ; i++){
            if (nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            
        int sdx = -1;
        for(int j = n-1 ; j >= 0 ; j--){
            if (nums[j] > nums[idx]) {
                sdx = j;
                break;
            }
        }

        int temp = nums[idx];
        nums[idx] = nums[sdx];
        nums[sdx] = temp;

        List<Integer> lst = new ArrayList<>();
        for(int i = idx ; i < n ; i++){
            lst.add(nums[i]);
        }
        Collections.sort(lst);

        int ldx = 0;
        for(int i = idx ; i < n ; i++){
            nums[i] = lst.get(ldx) ;
            ldx++;
        }
    }else{
        List<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            lst.add(nums[i]);
        }
        Collections.reverse(lst);
        for(int j = 0 ; j < n ; j++){
            nums[j] = lst.get(j);
        }
    }
    }

    
}
