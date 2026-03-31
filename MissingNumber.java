public class MissingNumber {
    
    public int missingNumber(int[] nums) {



        // int N = nums.length;

        // int sumOfTotalElementIfRangeIsN = (N * (N+1))/2;

        // int sumOfArr = 0;

        // for(int i = 0 ; i < nums.length ; i++){

        //     sumOfArr = sumOfArr + nums[i];

        // }


        // int misNum = sumOfTotalElementIfRangeIsN - sumOfArr;



        
        /*Dusra method bhi dekh leeee */

        int[] arr = new int[nums.length+1];

        for(int i = 0 ; i < nums.length ; i++){

            arr[nums[i]]++;

        }

        int misNum = 0;

        for(int i = 0; i < arr.length ; i++){

            if (arr[i] == 0) {

                misNum = i;
                
            }
            
        }



    /*Abeee dimag lagaaaa itna bADA MISTAKE TUNE STATISTIC NI PADHIII KYAAA */


























        // int N = nums.length;
        
        // int misNum = 0 ;

        // for(int i = 0 ; i <= N ; i++){

        //     boolean isPresent = false;

        //     for(int j = 0 ; j < nums.length ; j++){

        //         if (nums[j] == i) {

        //             isPresent = true;
        //             continue;
                    
        //         }

        //     }

        //     if (isPresent) {

        //         misNum = i;

        //     }

        // }


        return misNum;
        
    }


    public static void main(String[] args) {

        MissingNumber mm = new MissingNumber();
        
        int[] nums = {1,3,0,2};

        int misNum = mm.missingNumber(nums);

        System.out.println(misNum);

    }
}
