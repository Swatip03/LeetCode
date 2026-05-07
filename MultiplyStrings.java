public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();

        int[] result = new int[m+n];
        for(int i = n-1 ; i >= 0 ; i-- ){

            for(int j = m-1 ; j >= 0 ; j--){

                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');

                int ones = mul%10;
                int tens = mul/10;

                result[i+j+1] += ones;
                result[i+j]+=tens;
            }
        }

        //handle the two digit number in the array ie the carry from right to left
        for(int k = m+n-1 ; k > 0 ; k--){
            result[k-1]+=result[k]/10;
            result[k]+=result[k]%10;
        }

        //Build the string
        StringBuilder sb = new StringBuilder();
        for(int digit : result){
            if(sb.length() == 0 && digit == 0) continue; //skip the leading zeroes
            sb.append(digit);
        }

        return sb.toString();
    }
}
