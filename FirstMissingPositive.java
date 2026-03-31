import java.util.Arrays;

public class FirstMissingPositive {
    
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // This is cyclic sort idk but this thing is giving the right answer
         
         for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        
       // In this question the range of the positive integer is from 1 to n
        for(int i = 0 ; i < n ; i++){

            if (nums[i] != i+1) {

                return i+1;
                
            }
        }

        return n+1;
        
    }

    public static void main(String[] args) {
        
        FirstMissingPositive fm = new FirstMissingPositive();

        int[] nums = {1,2,0};
        int ans = fm.firstMissingPositive(nums);

        System.out.println(ans);

    }
}
