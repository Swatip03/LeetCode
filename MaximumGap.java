import java.util.Arrays;

public class MaximumGap {
    
    public int maximumGap(int[] nums) {

        if (nums.length == 1) {

            return 0;
            
        }

        Arrays.sort(nums);

        int max = 0;

        for(int i = 1 ; i < nums.length ; i++){

            int diff = nums[i]-nums[i-1];

            if (diff > max) {

                max = diff;
                
            }

            

        }


        return max;

        
    }

    public static void main(String[] args) {
        
        MaximumGap mg = new MaximumGap();

        int[] nums = {3,1};

        int ans = mg.maximumGap(nums);

        System.out.println(ans);

    }
}
