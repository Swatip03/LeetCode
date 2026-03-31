public class SpecialArray {
    
    public boolean isArraySpecial(int[] nums) {

        for(int i = 0 ; i < nums.length - 1; i++){

            if (nums[i] % 2 != 0 && nums[i+1] % 2 != 0) {

                return false;
                
            }

            else if (nums[i] % 2 == 0 && nums[i+1] % 2 == 0) {

                return false;
                
            }

        }

        return true;
        
    }

    public static void main(String[] args) {
        
        SpecialArray sa = new SpecialArray();

        int[] nums = {4,3,1,6};

        boolean ans = sa.isArraySpecial(nums);

        System.out.println(ans);
    }
}
