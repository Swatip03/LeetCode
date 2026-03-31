public class XORoperationInAnArray {
    
    public int xorOperation(int n, int start) {

        int[] nums = new int[n];
        int result = 0;

        for(int i = 0 ; i < n ; i++){

            nums[i] = (start + (2*i));

            result = result ^ nums[i];

        }

        return result;
        
    }


    public static void main(String[] args) {
        
        XORoperationInAnArray xx = new XORoperationInAnArray();

        int n = 5;
        int start = 0;

        int result = xx.xorOperation(n, start);

        System.out.println(result);
    }
}
