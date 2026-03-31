import java.util.ArrayList;

import java.util.List;

public class PascalTriangle {

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    
    // Method to calculate nCr
    public static int nCr(int n, int r) {
        if (r > n) {
            return 0; // nCr is not defined for r > n
        }
        return factorial(n) / (factorial(r) * factorial(n - r))
    }

    
    public List<List<Integer>> generate(int numRows) {

        // See the pattern that u are observing here in which the triangle is upto the given number of rows and 
        // the numbers inside each list is the nCr value of the given thing 

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < numRows ; i++){

            List<Integer> lst = new ArrayList<>();

            for(int j = 0 ; j <= i ; j++){

                if (j <= i) {

                    lst.add(nCr(i, j));
                    
                }

            }

            list.add(lst);
        }



        
        return list;
    }

    public static void main(String[] args) {
        
        PascalTriangle pt = new PascalTriangle();

        int numOfRows = 5;

        List<List<Integer>> ans = pt.generate(numOfRows);

        System.out.println(ans);

    }
}
