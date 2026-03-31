import java.util.Arrays;

public class HowManyNumSmallerThanCurrentNum {
    
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){

            int count = 0;

            for(int j = 0 ; j < nums.length ; j++){

                if (nums[j] < nums[i] && i!=j) {

                    count++;
                    
                }

            }

            ans[i] = count;

        }


        return ans;
        
    }

    public static void main(String[] args) {

        HowManyNumSmallerThanCurrentNum hh = new HowManyNumSmallerThanCurrentNum();
        
        int[] nums = {6,5,4,8};

        int[] ans = hh.smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(ans));
    }
}
