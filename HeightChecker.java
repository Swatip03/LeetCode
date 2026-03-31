import java.util.Arrays;

public class HeightChecker {
    
    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];

        for(int i = 0 ; i < heights.length ; i++){

            expected[i] = heights[i];

        }

        Arrays.sort(expected);

        int cnt = 0;

        for(int i = 0 ; i < expected.length ; i++){

            if (expected[i] != heights[i]) {

                cnt++;
                
            }


        }


        return cnt;
        
    }

    public static void main(String[] args) {
        
        HeightChecker hc = new HeightChecker();

        int[] heights = {1,2,3,4,5};
        int ans = hc.heightChecker(heights);

        System.out.println(ans);
    }
}
