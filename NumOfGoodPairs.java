

public class NumOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){

            for(int j = 0 ; j < nums.length ; j++){

                if (nums[i] == nums[j] && i < j) {

                    count++;
                    
                }

            }

        }











        // ---------------------------------Giving run time error of Index out of bound------------------------------------------
        // ArrayList<Integer> pairs = new ArrayList<>();


        // for(int i = 0 ; i < nums.length  ; i++){

        //     for(int j = 0 ; j < nums.length  ; j++){

        //         if (nums[i] == nums[j] && i < j) {

        //             pairs.add(i, i);
        //             pairs.add(i+1,j);

                    
        //         }

        //     }

        // }

        // int NumOfGoodPairs = pairs.size() / 2;

         return count;
        
    }

    public static void main(String[] args) {
        
        NumOfGoodPairs n = new NumOfGoodPairs();

        int[] nums = {4,3,1,1,2};

        int pairs = n.numIdenticalPairs(nums);

        System.out.println("The total Number of pairs are :: "+pairs);
    }
}
