
import java.util.Arrays;
import java.util.HashMap;

public class UniqueNumberOfOccurence {
    
    public boolean uniqueOccurrences(int[] arr) {

        boolean isUnique = true;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){

            if (hmap.containsKey(arr[i])) {

                hmap.put(arr[i], hmap.get(arr[i])+1);
                
            }
            else{

                hmap.put(arr[i], 1);

            }

            

        }

        // Now taking out the number of occurance of each num
        int[] nums = new int[hmap.size()];
        int idx = 0;

        for(int val : hmap.values()){

            nums[idx] = val;
            idx++;

        }

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-1 ; i++){

            if (nums[i] == nums[i+1]) {

                isUnique = false;
                break;
                
            }

        }
        
        return isUnique;
    }


    public static void main(String[] args) {
        
        UniqueNumberOfOccurence uc = new UniqueNumberOfOccurence();

        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        boolean ans = uc.uniqueOccurrences(arr);

        System.out.println(ans);

    }
}
