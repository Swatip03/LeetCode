public class PowerOfFour {
    
    public boolean isPowerOfFour(int n) {

        
        if (n == 0) {

            return false;
            
        }

        if (n < 0) {

            return false;
            
        }

        if (n == 1) {

            return true;
            
        }


        // Condition for power of three

        while ( n > 0) {

            if ( (n % 4 != 0) && (n != 1)) {

                return false;
                
            }

            n = n/4;
            
        }


        return true;
        
    }

    public static void main(String[] args) {
        
        PowerOfFour pp = new PowerOfFour();

        int n = 20;

        boolean ans = pp.isPowerOfFour(n);

        System.out.println(ans);
    }
}
