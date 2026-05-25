package ArrayI;
import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        // Ok so intution is that each above row in the triangle is the sum of 
        // the two adjacent elements
        int n = numRows;
        List<List<Integer>> result = new ArrayList<>();

        for(int r = 0 ; r < n ; r++){
            List<Integer> lst = new ArrayList<>();
            for(int c = 0 ; c <= r ; c++){
                if (c == 0 || c == r) { //as at the beginning and the end there is 1
                    lst.add(1);
                }else{
                    int prev1 = result.get(r-1).get(c-1);
                    int prev2 = result.get(r-1).get(c);
                    lst.add(prev1+prev2);
                }
            }
            result.add(lst);
        }

        return result;

    }

}
