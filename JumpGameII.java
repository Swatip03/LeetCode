public class JumpGameII {
    
    public int jump(int[] nums) {

        
        if(nums.length == 1){
            return 0;
        }

        int jump = 0;
        int maxIdx = 0;

        for(int i = 0 ; i < nums.length ; i++){

            int sum = i + nums[i];

            if (maxIdx < sum) {

                maxIdx = sum;
                jump++;
                
            }

            if (maxIdx >= nums.length-1) {

                return jump;
                
            }
        }

        return jump;
        
    }

    public static void main(String[] args) {
        
        JumpGameII jg = new JumpGameII();

        int[] nums = {1,2,3};
        int ans = jg.jump(nums);

        System.out.println(ans);
    }
}
