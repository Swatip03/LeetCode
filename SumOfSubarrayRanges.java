public class SumOfSubarrayRanges {
    
    public long subArrayRanges(int[] nums) {

        long total = 0;

        for(int i = 0 ; i < nums.length ; i++){

            int min = nums[i];
            int max = nums[i];

            for(int j = i ; j < nums.length ; j++){

                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                long range = max - min;

                total = total + range;


            }
        }

        return total;
     
    }

    public static void main(String[] args) {
        
        SumOfSubarrayRanges sr = new SumOfSubarrayRanges();

        int[] nums = {4,-2,-3,4,1};

        long ans = sr.subArrayRanges(nums);

        System.out.println(ans);

    }
}
