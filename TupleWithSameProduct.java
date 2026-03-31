import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct 

     public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> prodCount = new HashMap<>();
        int cnt = 0;

        // Generate all pairs (i, j)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];

                // If the product is already in map, add to count
                if (prodCount.containsKey(product)) {
                    cnt += 8 * prodCount.get(product);  // Each pair contributes 8 permutations
                }

                // Store this product in the map
                prodCount.put(product, prodCount.getOrDefault(product, 0) + 1);
            }
        }

        return cnt;



        
    }

    public static void main(String[] args) {
        
        TupleWithSameProduct twp = new TupleWithSameProduct();

        int[] nums = {1,2,4,5,10};

        int ans = twp.tupleSameProduct(nums);

        System.out.println(ans);

    }
}
