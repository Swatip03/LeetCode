import java.util.Arrays;

public class RearrangeArrayElementBySign {

    
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] pos = new int[n/2];
        int[] neg = new int[n/2];

        int idx = 0;
        int ndx = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] >= 0) {

                pos[idx] = nums[i];

                idx++;
                
            }

            if (nums[i] < 0) {

                neg[ndx] = nums[i];

                ndx++;
                
            }

        }

        // Merge the elements of both negative and positive integers

        idx = 0;
        ndx = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if ( i % 2 == 0) {

                nums[i] = pos[idx];
                idx++;
                
            }

            if ( i % 2 != 0) {

                nums[i] = neg[ndx];
                ndx++;
                
            }
        }


        return nums;
        
    }

    public static void main(String[] args) {
        
        RearrangeArrayElementBySign ra = new RearrangeArrayElementBySign();

        int[] nums = {-1,1};

        int[] ans = ra.rearrangeArray(nums);

        System.out.println(Arrays.toString(ans));
        // [3,-2,1,-5,2,-4]

    }
}