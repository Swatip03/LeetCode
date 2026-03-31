public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        
        int[] indices = new int[2];

        for(int i = 0 ; i < nums.length ; i++){

            for(int j = nums.length - 1 ; j >= 0 ; j--){

                if(nums[i] + nums[j] == target && i != j){

                    indices[0] = j;
                    indices[1] = i;

                }


            }

        }

        return indices;
        
    }

    public static void main(String[] args) {
        
        TwoSum tt = new TwoSum();

        int[] nums = {2,4,11,3};
        int target = 6;

        int[] index = tt.twoSum(nums,target);

        System.out.println(index[0]+ " "+ index[1]);
        
    }
}
