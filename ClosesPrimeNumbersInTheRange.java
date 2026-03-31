import java.util.ArrayList;
import java.util.Arrays;

public class ClosesPrimeNumbersInTheRange {

    public boolean helpr(int num){

        if (num < 2) {

            return false;
            
        }

        for(int i = 2 ; i*i <= num ; i++){

            if (num % i == 0) {

                return false;
                
            }

        }

        return true;
    }
    
    public int[] closestPrimes(int left, int right) {

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = left ; i <= right ; i++){

            if (helpr(i)) {

                lst.add(i);
                
            }

        }

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1 ; i < lst.size() ; i++){

            int diff = lst.get(i) - lst.get(i-1);

            if (minDiff > diff) {

                minDiff = diff;
                
            }

        }


        for(int i = 1 ; i < lst.size() ; i++){

            if (lst.get(i) - lst.get(i-1) == minDiff) {

                ans[0] = lst.get(i-1);
                ans[1] = lst.get(i);
                break;
                
            }

        }

        return ans;

        
    }

    public static void main(String[] args) {
        
        ClosesPrimeNumbersInTheRange cp = new ClosesPrimeNumbersInTheRange();

        int left = 19;
        int right = 31;

        int[] ans = cp.closestPrimes(left, right);

        System.out.println(Arrays.toString(ans));




    }
}
