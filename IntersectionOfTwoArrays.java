
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> interSet = new HashSet<>();

        for(int i = 0 ; i < nums1.length ; i++){

            set.add(nums1[i]);

        }
        // Check if the element is present in the set 1 then add 

        for(int i = 0 ; i < nums2.length ; i++){

            if (set.contains(nums2[i])) {

                interSet.add(nums2[i]);
                
            }
        }

        int[] arr = new int[interSet.size()];

        int idx = 0;

        for(int val : interSet){

            arr[idx] = val;
            idx++;

        }

        return arr;


        
    }


    public static void main(String[] args) {
        
        IntersectionOfTwoArrays ii = new IntersectionOfTwoArrays();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] arr = ii.intersection(nums1, nums2);

        System.out.println(Arrays.toString(arr));

    }
}
