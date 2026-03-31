public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if(n < 0){

            return false;

        }

        if(n == 0){

            return false;

        }

        if(n == 1){

            return true;

        }

        while(n > 0){

            if(n % 2 == 1 && n != 1){

                return false;

            }

            n = n / 2;

        }


        return true;
        
    }

    public static void main(String[] args) {
        
        PowerOfTwo pp = new PowerOfTwo();

        int n = -16;

        boolean ans = pp.isPowerOfTwo(n);

        System.out.println(ans);
    }
}
