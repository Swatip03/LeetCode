import java.util.Arrays;
import java.util.HashMap;


public class MergeTwo2DArrayWithSummationOfValues {
    
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        // Make a hashmap
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0 ; i < nums1.length ; i++){

            for(int j = 0 ; j < nums1[0].length ; j++){

                if (j == 0) {

                    hmap.put(nums1[i][j], nums1[i][j+1]);
                    
                }


            }
        }

        for(int i = 0 ; i < nums2.length ; i++){

            for(int j = 0 ; j < nums2[0].length ; j++){

                if (j == 0) {

                    if (hmap.containsKey(nums2[i][j])) {

                        hmap.put(nums2[i][j], hmap.get(nums2[i][j]) + nums2[i][j+1]);
                        
                    }
                    else{

                        hmap.put(nums2[i][j], nums2[i][j+1]);

                    }
                    
                }

            }
        }


        int[] arrKey = new int[hmap.size()];
        int idx = 0;
        
        for(int key : hmap.keySet()){

            arrKey[idx] = key;
            idx++;

        }

        Arrays.sort(arrKey);

        int[][] ans = new int[hmap.size()][2];
        int adx = 0;

        for(int i = 0 ; i < ans.length ; i++){

            for(int j = 0 ; j < ans[0].length ; j++){

                if (j == 0) {

                    ans[i][j] = arrKey[adx];
                    ans[i][j+1] = hmap.get(arrKey[adx]);
                    adx++;
                    
                }

            }
        }


        return ans;
        
    }

    public static void main(String[] args) {

        MergeTwo2DArrayWithSummationOfValues mt = new MergeTwo2DArrayWithSummationOfValues();

        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};

        int[][] ans = mt.mergeArrays(nums1, nums2);

        System.out.println(Arrays.deepToString(ans));
        

    }
}
