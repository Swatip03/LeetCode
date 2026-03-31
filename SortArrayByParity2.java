import java.util.Arrays;

public class SortArrayByParity2 {

    public int[] sortArrayByParityII(int[] nums) {

        
        
        int idx = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if ((nums[i] % 2 == 0) && (idx % 2 == 0)) {

                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;

                idx++;
                
            }
            
            if ((nums[i] % 2 != 0) && (idx % 2 != 0)) {

                
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;

                idx++;


                
            }

        }


        return nums;
        
    }
    

    public static void main(String[] args) {
        
        SortArrayByParity2 spp = new SortArrayByParity2();

        int[] nums = {2,3};

        int[] ans = spp.sortArrayByParityII(nums);

        System.out.println(Arrays.toString(ans));
    }
}
