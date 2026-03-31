public class RotateArray {
    
    public void rotate(int[] nums, int k) {

        // First Method (Try to make a new array)

        if (k > nums.length) {

            k = k % nums.length;
            
        }
            

        int[] arr = new int[nums.length];

        for(int i = 0 ; i < arr.length ; i++ ){

            if (i < k) {

                arr[i] = nums[i+arr.length - k];
                
            }
            else{

                arr[i] = nums[i-k];

            }

        }



        for(int i = 0 ; i < nums.length ; i++){

            nums[i] = arr[i];


        }

        
    
        
    }


    public static void main(String[] args) {

        RotateArray rr = new RotateArray();
        
        int[] nums = {1,2};
        int k = 3;

        rr.rotate(nums, k);

        for(int i = 0 ; i < nums.length ; i++){

            System.out.print(nums[i] + " ");

        }

        
    }
}
