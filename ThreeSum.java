import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {

        // The Optimal approach
        //Firstly sort the given array then use some pointers
        // first fix a pointer at idx  then left at idx+1 and right at nums.length-1

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i++){

            if (i > 0 && nums[i] == nums[i-1]) {

                continue;
                
            }


            int j = i + 1;        // second pointer
            int k = nums.length-1;


            while (j < k) {

                int sum = nums[i]+nums[j]+nums[k];

                if (sum < 0) {

                    j++;
                    
                }

                else if(sum > 0){

                    k--;

                }

                else{

                    List<Integer> lst = new ArrayList<>();

                    lst.add(nums[i]);
                    lst.add(nums[j]);
                    lst.add(nums[k]);

                    list.add(lst);

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j-1]) {

                        j++;
                        
                    }

                    while (j < k && nums[k] == nums[k+1]) {

                        k--;
                        
                    }
                }
                
            }
        }
  
        return list;
        
    }

    public static void main(String[] args) {
        
        ThreeSum ts = new ThreeSum();

        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> lst = ts.threeSum(nums);

        System.out.println(lst);
    }
}
