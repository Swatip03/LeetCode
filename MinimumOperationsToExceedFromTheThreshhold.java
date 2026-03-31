import java.util.ArrayList;

public class MinimumOperationsToExceedFromTheThreshhold {

    public boolean isGreater(ArrayList<Integer> lst , int k){

        boolean isGreater = true;

        for(int i = 0 ; i < lst.size() ; i++){

            if (lst.get(i) < k) {

                isGreater = false;
                
            }

        }

        return isGreater;


    }

    public int minOperations(int[] nums, int k) {

        //The thing is that u have to remove the minimum element in one operation and after each operation the length of the nums decreases and at last the u have to return the aray with all element 
        
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){

            lst.add(nums[i]);

        }

        
        int cnt = 0;
        while (!isGreater(lst, k)) {

            int min = 0;


            for(int i = 0 ; i < lst.size() ; i++){

                if (lst.get(min) > lst.get(i)) {

                    min = i;

                    
                }

            }

            
                lst.remove(min);
                cnt++;
                
            
        }


        
        return cnt;

        
        
    }


    public static void main(String[] args) {
        
        MinimumOperationsToExceedFromTheThreshhold mt = new MinimumOperationsToExceedFromTheThreshhold();

        int[] nums = {1,1,2,4,9};
        int k = 1;

        int ans = mt.minOperations(nums, k);

        System.out.println(ans);
    }
    
}
