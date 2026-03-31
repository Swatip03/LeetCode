public class SingleElementInASortedArray {
    
    public int singleNonDuplicate(int[] nums) {

        for(int i = 0 ; i < nums.length ; i++){

            if (i == 0 && nums[i] != nums[i+1]) {

                return nums[i];
                
            }

            if (i == nums.length -1 && nums[i] != nums[i-1]) {

                return nums[i];
                
            }

            if (nums[i] != nums[i+1] && nums[i] != nums[i-1]) {

                return nums[i];
                
            }
        }
        

        return -1;

    }


    public static void main(String[] args) {
        
        SingleElementInASortedArray ss = new SingleElementInASortedArray();

        int[] nums = {3,3,7,7,10,11,11};
        
        int singEle = ss.singleNonDuplicate(nums);

        System.out.println(singEle);
    }
}
