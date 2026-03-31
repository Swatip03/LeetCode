import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPartition {
    
    public int arrayPairSum(int[] nums) {


        // To do the most optimal pairing we have to sort the array then we have to take the most minimum of the pair and then the
        // sum of them will be automatically the greatest 
        Arrays.sort(nums);

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 1 ; i <  nums.length ; i++){

            

            if (i % 2 != 0) {

                 int min = Math.min(nums[i-1], nums[i]);
                 lst.add(min);
                
            }

            


        }

        System.out.println(lst);

        int sum = 0;

        for(int i = 0 ; i < lst.size() ; i++){

            sum = sum + lst.get(i);

        }

        return sum;
        
    }


    public static void main(String[] args) {
        
        ArrayPartition ap = new ArrayPartition();

        int[] nums = {1,4,3,2};

        int ans = ap.arrayPairSum(nums);

        System.out.println(ans);
    }
}
