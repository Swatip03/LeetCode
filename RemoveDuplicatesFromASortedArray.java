import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesFromASortedArray {

    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i =  0 ; i < nums.length ; i++){

            set.add(nums[i]);

        }

        Iterator<Integer> it = set.iterator();

        int i = 0;
        while (it.hasNext()) {

            nums[i] = it.next();
            i++;
            
        }

        for(int j = 0 ; j < set.size() ; j++){

            for(int k = j+1 ; k < set.size() ; k++){

                if (nums[j] > nums[k]) {

                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                    
                }
            }
        }

        

        return set.size();
        
    }


    public static void main(String[] args) {
        
        RemoveDuplicatesFromASortedArray rr = new RemoveDuplicatesFromASortedArray();

        int[] nums = {-3,-1,0,0,0,3,3};

        System.out.println(Arrays.toString(nums));

        int ans = rr.removeDuplicates(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println(ans);
    }
    
}
