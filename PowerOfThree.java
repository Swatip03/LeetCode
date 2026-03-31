public class PowerOfThree {
    
    public boolean isPowerOfThree(int n) {

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

            if ( (n % 3 != 0) && (n != 1)) {

                return false;
                
            }

            n = n/3;
            
        }


        return true;
        
    }


    public static void main(String[] args) {
        
        PowerOfThree pp = new PowerOfThree();

        int n = -23;

        boolean ans = pp.isPowerOfThree(n);

        System.out.println(ans);

    }
}
