import java.util.ArrayList;
import java.util.Arrays;

public class ApplyOperationsToAnArray {
    
    public int[] applyOperations(int[] nums) {

        for(int i = 0 ; i < nums.length-1 ; i++){

            if (nums[i] == nums[i+1]) {

                nums[i] = nums[i]*2;
                nums[i+1] = 0;
                
            }

        }

        // To shift all the non negative number on one side of the array
        int cnt = 0;
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] != 0) {

                cnt++;
                lst.add(nums[i]);

            }

        }

        // Now create a new array
        int[] arr = new int[nums.length];
        int idx = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if (i < cnt) {

                arr[i] = lst.get(idx);
                idx++;
                
            }
            else{

                arr[i] = 0;

            }

        }


        return arr;
        
    }

    public static void main(String[] args) {
        
        ApplyOperationsToAnArray ao = new ApplyOperationsToAnArray();

        int[] nums = {0,1};

        int[] arr = ao.applyOperations(nums);

        System.out.println(Arrays.toString(arr));

    }
}
