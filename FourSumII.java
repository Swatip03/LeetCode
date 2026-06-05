package ArrayProb;
import java.util.*;
public class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // nums1 + nums2  →  first half
        // nums3 + nums4  →  second half
        int n = nums1.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        //since nums1 + nums2 = -(nums3+nums4)

        //finding the sum for first half & filling the hashmap
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int sum = nums1[i]+nums2[j];
                if (hmap.containsKey(sum)){
                    hmap.put(sum, hmap.get(sum)+1);
                }else{
                    hmap.put(sum, 1);
                }
            }
        }

        int count = 0;
        //now for finding the second half
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int sum = -(nums3[i]+nums4[j]);
                if (hmap.containsKey(sum)) {
                    count+=hmap.get(sum);
                }
            }
        }

        return count;
    }
}
