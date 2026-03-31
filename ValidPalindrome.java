public class ValidPalindrome {
    
    public boolean isPalindrome(String s) {

        if (s.equals(" ")) {

            return true;
            
        }

        String ste = s.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();



        String[] str = ste.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length ; i++){

            sb.append(str[i]);

        }

        String origStr = sb.toString();

        StringBuilder sbRev = new StringBuilder();

        sbRev = sb.reverse();

        String revStr = sbRev.toString();


        if (origStr.equals(revStr)) {

            return true;
            
        }
        else{

            return false;

        }
        
    }


    public static void main(String[] args) {
        
        ValidPalindrome vv = new ValidPalindrome();

        String s = "a.";

        boolean ans = vv.isPalindrome(s);

        System.out.println(ans);
    }
}
