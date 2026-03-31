public class MaxConsecutiveOnes {
    
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCnt = 0;
        int cnt = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] == 1) {

                cnt++;

                if(maxCnt < cnt){

                    maxCnt = cnt;

                }
            }
            else{

                cnt = 0;
                
            }


        }

        return maxCnt;
        
    }

    public static void main(String[] args) {
        
        MaxConsecutiveOnes mm = new MaxConsecutiveOnes();

        int[] nums = {1,1,0,1,1,1,0};

        int maxCnt = mm.findMaxConsecutiveOnes(nums);

        System.out.println(maxCnt);
    }
}
