import java.util.HashSet;

public class SubarrayWithKDifferentIntegers {
    
    public int subarraysWithKDistinct(int[] nums, int k) 

        int i = 0;
        int j = 0;

        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;

        while (j < nums.length) {

            if (set.size() > k) {

                set.remove(nums[i]);
                i++;
                
            }

            if (set.size() == k) {

                cnt++;
                
            }

            set.add(nums[j]);
            j++;

            
        }


        return cnt;
        
    }

    public static void main(String[] args) {
        
        SubarrayWithKDifferentIntegers sd = new SubarrayWithKDifferentIntegers();

        int[] nums = {1,2,1,2,3};
        int k = 2;

        int ans = sd.subarraysWithKDistinct(nums, k);

        System.out.println(ans);


    }
}
