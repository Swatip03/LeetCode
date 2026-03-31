public class JumpGame {
    
    public boolean canJump(int[] nums) {

        // See in the problem the elements that are given to u in the array represent the number of idx it can jump to go to the last index

        // One observation is that if the 0 element is not present in the array then the ans will always be true
        int maxIdx = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if (i > maxIdx) {

                return false;
                
            }

            maxIdx = Math.max(maxIdx, i + nums[i]);

        }

        return true;
        
    }

    public static void main(String[] args) {
        
        JumpGame jg = new JumpGame();

        int[] nums = {3,2,1,0,4};

        boolean ans = jg.canJump(nums);

        System.out.println(ans);


    }
}
