public class ClearDigits {

    public String clearDigits(String s) {

        StringBuilder sb = new StringBuilder(s);

        int idx = 0;
        int cdx = -1;

        while (idx < sb.length()) {

            if (sb.charAt(idx) >= 48 && sb.charAt(idx) <= 57) {

                sb.deleteCharAt(idx);
                
                if (idx != 0) {

                    sb.deleteCharAt(cdx);
                    
                }

                idx = 0;
                cdx = -1;
                
                
            }

            idx++;
            cdx++;
            
        }


        String str = sb.toString();


        return str;
        
    }


    public static void main(String[] args) {
        
        ClearDigits cd = new ClearDigits();

        String s = "cb34";

        String ans = cd.clearDigits(s);

        System.out.println(ans);
    }
    
}
