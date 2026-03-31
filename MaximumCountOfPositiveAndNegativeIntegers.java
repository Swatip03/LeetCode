public class MaximumCountOfPositiveAndNegativeIntegers {
    
    public int maximumCount(int[] nums) {

        int posCnt = 0;
        int negCnt = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] > 0) {

                posCnt++;
                
            }

            if (nums[i] < 0) {

                negCnt++;
                
            }

        }


        return Math.max(posCnt, negCnt);
        
    }

    public static void main(String[] args) {
        
        MaximumCountOfPositiveAndNegativeIntegers mc = new MaximumCountOfPositiveAndNegativeIntegers();

        int[] nums = {5,20,66,1314};

        int ans = mc.maximumCount(nums);

        System.out.println(ans);


    }
}
