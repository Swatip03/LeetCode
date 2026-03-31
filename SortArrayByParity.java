import java.util.Arrays;

public class SortArrayByParity {
    
    public int[] sortArrayByParity(int[] nums) {

        
        int idx = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] % 2 == 0) {

                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;

                idx++;
                
            }

        }

        



        



        return nums;
        
    }

    public static void main(String[] args) {
        
        SortArrayByParity sp = new SortArrayByParity();

        int[] nums = {0};

        int[] ans = sp.sortArrayByParity(nums);

        System.out.println(Arrays.toString(ans));


    }
}
