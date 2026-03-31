public class MultiplyStrings {
    
    public String multiply(String num1, String num2) {

        int[] nums1 = new int[num1.length()];
        int[] nums2 = new int[num2.length()];

        for(int i = 0 ;i <nums1.length ; i++){

            nums1[i] = Character.getNumericValue(num1.charAt(i));

        }
        
        for(int i = 0 ;i <nums2.length ; i++){

            nums2[i] = Character.getNumericValue(num2.charAt(i));

        }

        int[] result = new int[nums1.length+nums2.length];

        int carr = 0;
        int idx = result.length-1;

        for(int i = nums2.length ; i >= 0 ; i--){

            int ival = i;

            for(int j = nums1.length ; j >= 0 ; j--){

                int jval = j;

                int prod = ival*jval + carr;

                result[idx] = prod % 10;
                carr = prod / 10;
                idx--;

            }

        }

        StringBuilder sb = new StringBuilder();

        int s = 0;

        for(int i = 0 ;  i < result.length ; i++){

            if (result[idx] != 0) {

                s = idx;
                break;
                
            }

        }

        for(int i = s ; i < result.length ; i++){

            sb.append(result[i]);

        }

        String str = sb.toString();


        return str;



        
    }


    public static void main(String[] args) {
        
        MultiplyStrings mm = new MultiplyStrings();

        String num1 = "123";
        String num2 = "456";

        String ans = mm.multiply(num1, num2);

        System.out.println(ans);

    }
}
