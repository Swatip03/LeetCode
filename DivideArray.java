import java.util.HashMap;

public class DivideArray {
    
    public boolean divideArray(int[] nums) {

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            if (!hmap.containsKey(nums[i])) {

                hmap.put(nums[i], 1);
                
            }
            else{

                hmap.put(nums[i], hmap.get(nums[i])+1);

            }
        }



        for(int ent : hmap.keySet()){

            if (hmap.get(ent)%2 != 0) {

                return false;
                
            }

        }


        return true;

    }


    public static void main(String[] args) {
        
        DivideArray da = new DivideArray();

        int[] nums = {1,2,3,4};

        boolean ans = da.divideArray(nums);

        System.out.println(ans);
        
    }
}
