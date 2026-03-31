public class ReverseWordsInAString {
    
    public String reverseWords(String s) {

        String[] str = s.split(" ");

        String[] revStr = new String[str.length];

        for(int i = 0; i < str.length ; i++){

            StringBuilder sb = new StringBuilder(str[i]);

            sb.reverse();

            revStr[i] = sb.toString();

        }

        // Converting string array to the string 

        StringBuilder sbN = new StringBuilder();

        for(int i = 0 ; i < revStr.length ; i++){

            if (i != revStr.length-1) {

                sbN.append(revStr[i] + " ");
                
            }
            else{

                sbN.append(revStr[i]);

            }

        }

        String st = sbN.toString();


        return st;

        
        
    }


    public static void main(String[] args) {
        
        ReverseWordsInAString rs = new ReverseWordsInAString();

        String s = "Mr Ding";

        String ans = rs.reverseWords(s);

        System.out.println(ans);
    }
}
