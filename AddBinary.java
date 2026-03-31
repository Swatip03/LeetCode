public class AddBinary {
    
    public String addBinary(String a, String b) {

        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);

        int sum = num1 + num2;

        String str = Integer.toBinaryString(sum);

        return str;
        
    }


    public static void main(String[] args) {

        AddBinary aa = new AddBinary();
        
        String a = "1010";
        String b = "1011";

        String str = aa.addBinary(a, b);

        System.out.println(str);

        
    }
}
