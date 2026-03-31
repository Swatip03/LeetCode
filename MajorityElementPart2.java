
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementPart2 {
    
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        // Filling the hash map
        for(int i = 0 ; i < n ; i++){

            if (!hmap.containsKey(nums[i])) {

                hmap.put(nums[i], 1);

            }
            else{

                hmap.put(nums[i], hmap.get(nums[i])+1);

            }

        }

        int cond = n/3;

        // Now make a list to store all the keys that has frequency of greater than cond
        List<Integer> lst = new ArrayList<>();

        for(Map.Entry<Integer,Integer> ent : hmap.entrySet()){

            if (ent.getValue() > cond) {

                lst.add(ent.getKey());

            }

        }

        return lst;

        
    }

    public static void main(String[] args) {

        MajorityElementPart2 me = new MajorityElementPart2();

        int[] nums = {5,5,5,1,2,3,3,3};

        List<Integer> lst = me.majorityElement(nums);

        System.out.println(lst);
        

    }
}
