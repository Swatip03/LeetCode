import java.util.Arrays;

public class ContainsDuplicatePart3 {
    
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        Arrays.sort(nums);

        boolean isDuplicate = false;

        for(int i = 1 ; i < nums.length ; i++){

            if ((i!=(i-1)) && (Math.abs(i-(i-1)) <= indexDiff) && (Math.abs(nums[i] - nums[i+1]) <= valueDiff)) {

                isDuplicate = true;
                break;

                
            }



        }

        return isDuplicate;
        
    }


    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1};
        int indexDiff = 3;
        int valueDiff 
    }
}
