public class ReverseWordsInASentence {
    
    public String reverseWords(String s) {

        String str = s.trim();

        String[] strArr = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = strArr.length-1 ; i >= 0 ; i--){

            if ( i == 0) {

                sb.append(strArr[i]);
                
            }

            if ( (!strArr[i].equals("")) && (i != 0)) {

                sb.append(strArr[i] + " ");
                
            }

        }

        String st = sb.toString();

        return st;
        
    }


    public static void main(String[] args) {
        
        ReverseWordsInASentence rs = new ReverseWordsInASentence();

        String s = "a good   example";

        String str = rs.reverseWords(s);

        System.out.println(str);
    }
}
