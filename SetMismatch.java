import java.util.Arrays;
import java.util.HashSet;

public class SetMismatch {
    
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int totalSum = (n*(n+1))/2;

        HashSet<Integer> set = new HashSet<>();

        int dupNum = 0;

        for(int i = 0 ; i < nums.length-1 ; i++){

            if ( (nums[i] == nums[i+1])) {

                dupNum = nums[i];
                
            }

            set.add(nums[i]);

        }

        set.add(nums[nums.length-1]);

        int[] arr = new int[nums.length-1];

        int idx = 0;
        for(int val : set){

            arr[idx] = val;
            idx++;

        }

        int remSum = 0;

        for(int i = 0 ; i < arr.length ; i++){

            remSum = remSum + arr[i];
            
        }

        int remEle = totalSum - remSum;

        int[] ans = new int[2];

        ans[0] = dupNum;
        ans[1] = remEle;

        return ans;
        
    }


    public static void main(String[] args) {

        SetMismatch sm = new SetMismatch();
        
        int[] nums = {2,3,2};

        int[] ans = sm.findErrorNums(nums);

        System.out.println(Arrays.toString(ans));

    }
}
