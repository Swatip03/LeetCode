public class ReverseTheInteger {
    
    public int reverse(int x) {

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        


        
        int revNum = 0;
        int num = Math.abs(x);

        while (num > 0) {

            int digit = num % 10;
            revNum = revNum*10 + digit;
            num = num / 10;
            
        }


        if (revNum > maxInt) {

            return 0;
            
        }

        if (revNum < minInt) {

            return 0;
            
        }


        if (x < 0) {

            return revNum*-1;
            
        }

        

        return revNum;

    }

    public static void main(String[] args) {
        
        

        ReverseTheInteger rr = new ReverseTheInteger();

        int x = 1534236469;

        int revNum = rr.reverse(x);

        System.out.println(revNum);
    }


}
