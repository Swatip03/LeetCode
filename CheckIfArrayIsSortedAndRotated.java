public class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {

        boolean allSame = true;

        for(int i = 0 ; i < nums.length-1 ; i++){

            if (nums[i] != nums[i+1]) {

                allSame = false;

            }

        }

        if (allSame) {

            return true;
            
        }

        int cnt = 0;

        // Finding inversion point in between
        for(int i = 1 ; i < nums.length; i++){

            if (nums[i-1] > nums[i]) {

                cnt++;
                
            }

        }

        // Checking the 2nd inversion point of the array

        if (nums[0] < nums[nums.length-1]) {

            cnt++;
            
        }


        if (cnt == 1) {

            return true;
            
        }


       return false;

        
    }

    public static void main(String[] args) {
        
        CheckIfArrayIsSortedAndRotated cc = new CheckIfArrayIsSortedAndRotated();

        int[] nums = {3,4,5,1,2};

        boolean ans = cc.check(nums);

        System.out.println(ans);

    }
    

}
