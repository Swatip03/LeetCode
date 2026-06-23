package StringsProb;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        /*
         * For every pair of digits, multiply them, figure out which column (place
         * value) the result belongs to, and dump it directly into that index in the
         * result array. At the end, handle carries and build the string.
         */

        char[] digit1 = num1.toCharArray();
        char[] digit2 = num2.toCharArray();

        //create result array of size n1+n2, filled with 0s
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1+n2];

        //Now for filling the result array
        for(int i = n1-1 ; i >= 0 ; i--){
            for(int j = n2-1 ; j >= 0 ; j--){
                int product = (digit1[i]-'0')*(digit2[j]-'0');

                int pos_digit = i+j+1;    // where product's unit digit goes
                int pos_carry = i+j;      // where carry goes

                int sum = product + result[pos_digit];    // add what's already there

                result[pos_digit] = sum%10;     //placing the unit digit
                result[pos_carry] = sum/10;     //placing the carry 
            }
        }

        //Now making the string
        StringBuilder sb = new StringBuilder();

        int nonZero = -1;
        for(int i = 0 ; i < result.length ; i++){
            if (result[i] != 0) {
                nonZero = i;
                break;
            }
        }

        if (nonZero != -1) {
            return "0";
        }

        for(int j = nonZero ; j < result.length ; j++){
            sb.append(result[j]);
        }

        return sb.toString();
    }
}
