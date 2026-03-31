public class ReverseprefixOfAWord {
    
    public String reversePrefix(String word, char ch) {

        int idx = word.indexOf(ch);

        if (idx != -1) {

            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i <= idx  ; i++){

                sb.append(word.charAt(i));

            }

            // Reversing the prefix
            sb.reverse();

            // Adding further characters of the string

            for(int i = idx + 1 ; i < word.length() ; i++){

                sb.append(word.charAt(i));

            }

            String str = sb.toString();

            return str;
            
        }

        return word;
        
    }

    public static void main(String[] args) {
        
        ReverseprefixOfAWord rp = new ReverseprefixOfAWord();

        String word = "xyxzxe";
        char ch = 'a';

        String str = rp.reversePrefix(word, ch);

        System.out.println(str);

    }
}
