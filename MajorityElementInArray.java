public class MajorityElementInArray {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        // First Sorting the array

        for(int i = 0 ; i < n ; i++ ){

            for(int j = 1 ; j < n - i ; j++){

                if(nums[j] < nums[j-1]){

                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;

                }

            }

        }

        // Finding the majority element

        int majEle = nums[0];


        for(int i = 0 ; i < n ; i++){

            int cnt = 0;

            for(int j = 0 ; j < n ; j++){

                if(nums[i] == nums[j]){

                    cnt++;

                }

            }

            if(cnt > (n/2) ){

                majEle = nums[i];

            }

        }

        return majEle;
        
    }

    public static void main(String[] args) {
        
        MajorityElementInArray mm = new MajorityElementInArray();

        int[] nums = {3,2,3} ;

        int majorityEle = mm.majorityElement(nums);

        System.out.println(majorityEle);
    }
}
