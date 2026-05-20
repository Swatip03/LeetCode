public class PowX{
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1; // Base Case
        }

        if (n < 0) {
            return myPow(1/x, -n);
        }

        double half = myPow(x, n/2);

        if (n%2 == 0) {  // n is even
            return half*half;
        }else{           // n is odd
            return half*half*x;
        }
        
    }



    public static void main(String[] args) {
        
        PowX pw = new PowX();
        double x = 2;
        int n = 10;

        double ans = pw.myPow(x, n);
        System.out.println(ans);
    }
}