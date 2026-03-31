import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElement {
    
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            if (hmap.containsKey(nums[i])) {

                hmap.put(nums[i], hmap.get(nums[i])+1);
                
            }

            else{

                hmap.put(nums[i], 1);

            }

        }

        


        
    }

    public static void main(String[] args) {
        
        TopKFrequentElement tf = new TopKFrequentElement();

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        tf.topKFrequent(nums, k);




    }
}
