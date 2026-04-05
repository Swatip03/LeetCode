public class IntegerToRoman {

    public String intToRoman(int num) {

        // Making the array for all the possible values and strings that are used
        // in converting the int digit to the roman
        // especiallly taking the care the possibilites of digits 4 and 9

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int vdx = 0;
        int sdx = 0;
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            // The condition for subtracting the number like what if u got num = 4 and values[vdx] = 1000 
            // this is wrong after subtraction num becomes -v
            if (num >= values[vdx]) {
                num = num-values[vdx];
                sb.append(symbols[sdx]);
            }

            // The condition to move forward in the values as well as the symbols array
            if (num < values[vdx]) {
                vdx++;
                sdx++;
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        IntegerToRoman ir = new IntegerToRoman();
        int num = 1994;

        String ans = ir.intToRoman(num);
        System.out.println(ans);
    }
}
