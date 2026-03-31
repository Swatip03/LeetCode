import java.util.*;

public class NextGreaterElemnet {

    
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // See there are two arrays nums1 is the subset of the array nums2 and u have to find the next greater element of the array nums1
        // in the corresponding superset of the array nums2

        // Create a monotonic stack in which the elements are arranged in a specific order whether it is ascending and descending

        Stack<Integer> stk = new Stack<>();

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = nums2.length - 1; i >= 0 ; i--){

            while (!stk.isEmpty() && nums2[i] >= stk.peek()) {

                stk.pop();
                
            }


            if (stk.isEmpty()) {

                hmap.put(nums2[i], -1);
                
            }
            else{

                hmap.put(nums2[i], stk.peek());

            }

            stk.push(nums2[i]);

            
        }

        // Now for the resultant array
        int[] ans = new int[nums1.length];

        for(int i = 0 ; i < ans.length ; i++){

            if (hmap.containsKey(nums1[i])) {

                ans[i] = hmap.get(nums1[i]);
                
            }

        }

       return ans;
        
    }

    public static void main(String[] args) {

        NextGreaterElemnet ng = new NextGreaterElemnet();

        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        int[] ans = ng.nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(ans));


        

    }
}
