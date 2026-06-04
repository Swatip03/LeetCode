package ArrayProb;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // See in three sum problem it is specifically mentioned that the sum of
        // the three elements sum up to zero!!!!!!!
        // nums[r]+nums[l] = -nums[i]
        // the above eq is my thought process
        List<List<Integer>> result = new ArrayList<>();
        // Since array is sorted, duplicates are always neighbors. So just peek at your neighbor — if same value, skip!
        
        for(int i = 0 ; i < n ; i++){
            int target = -nums[i];  //Make one triplet fixed!!!!!
            int l = i+1;  //The initialise should be like this so that l & i are different
            int r = n-1;

            if(i > 0 && nums[i] == nums[i-1]) continue;   //Skipping duplicate i
            
            while (l < r) {
                int sum = nums[l]+nums[r];
                if (sum == target) { //→ only this runs, pointers STAY
                    List<Integer> lst = Arrays.asList(nums[i],nums[l],nums[r]);
                    result.add(lst);
                    //Skipping duplicate l and r
                    while(l < r && nums[l] == nums[l+1])l++;
                    while(l < r && nums[r] == nums[r-1])r--;
                    l++; //final move!!!!
                    r--; //final move!!!!
                }else if (sum < target) {
                    l++;
                }else{
                    r--;
                }
            }

        }

        return result;
    }
}
