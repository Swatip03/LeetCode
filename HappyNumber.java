public class HappyNumber {
    public  boolean isHappy(int n) {
        // Base Conditions 
        if (n == 1) {
            return true;
        }
        if (n == 4) {
            return false;
        }

        // Calculate the happy number 
        int num = n;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit*digit;
            num = num/10;
        }

        // Recurrence relation
        return isHappy(sum);
    }
}
