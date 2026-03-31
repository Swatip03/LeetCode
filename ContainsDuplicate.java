import java.util.Arrays;

public class ContainsDuplicate {
    

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        boolean isDuplicate = false;

        for(int i = 0 ; i < nums.length - 1 ; i++){

            if (nums[i] == nums[i+1]) {

            isDuplicate = true;
            break;

            }
        }



        return isDuplicate;
        
    }


    public static void main(String[] args) {
        
        ContainsDuplicate cc = new ContainsDuplicate();

        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        boolean ans = cc.containsDuplicate(nums);

        System.out.println(ans);

    }
}
