import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    
    public int maximumProduct(int[] nums) {

       int n = 0;

       if (nums.length == 3) {

        n = nums[0]*nums[1]*nums[2];
        
       }


       Arrays.sort(nums);

       int cnt = 0;

       for(int i = 0 ;  i < nums.length ; i++){

        if (nums[i] < 0) {

            cnt++;
            
        }

       }

       if (cnt <= 1) {

        n = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        
       }
       
       else if (cnt == 2) {

        if (nums[0]*nums[1] > nums[nums.length-1]) {

            n = nums[0]*nums[1]*nums[nums.length-1];
            
        }

        else if (-nums[0] < nums[nums.length-1] && (-nums[0] > nums[nums.length-2])) {

            n = nums[0]*nums[1]*nums[nums.length-1];
            
        }

        else{

            n = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        }
        
       }

       else{

        if (nums[0]*nums[1]*nums[2] > nums[nums.length-1]) {

            n = nums[0]*nums[1]*nums[2];
            
        }

        else if (nums[0]*nums[1] > nums[nums.length-1]) {

            n = nums[0]*nums[1]*nums[nums.length-1];
            
        }

        else if (-nums[0] < nums[nums.length-1] && (-nums[0] > nums[nums.length-2])) {

            n = nums[0]*nums[1]*nums[nums.length-1];
            
        }

        else{

            n = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        }

        
       }




       return n;
    
        
    }


    public static void main(String[] args) {
        
        MaximumProductOfThreeNumbers mpt = new MaximumProductOfThreeNumbers();

        int[] nums = {-1,-2,-3,-4};

        int ans = mpt.maximumProduct(nums);

        System.out.println(ans);
    }
}
