public class PalindromeNumber {

    
    public boolean isPalindrome(int x) {

        
        int num = Math.abs(x);
        int revNum = 0;

        while (num > 0) {

            int digit = num % 10;
            revNum = revNum*10 + digit;
            num = num/10;
            
        }

        if (x < 0) {

            return false;
            
        }

        

        if (revNum == x) {

            return true;
            
        }
        

        return false;
        
    }

    public static void main(String[] args) {
        
        PalindromeNumber pp = new PalindromeNumber();

        int x = -121;

        boolean ans = pp.isPalindrome(x);

        System.out.println(ans);
    }
}
