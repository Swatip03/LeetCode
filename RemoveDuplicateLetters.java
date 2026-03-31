import java.util.HashMap;

public class RemoveDuplicateLetters {
    
    public String removeDuplicateLetters(String s) {

        HashMap<Character,Integer> hMap = new HashMap<>();
        

        for(int i = 0 ; i < s.length() ; i++){

            if (!hMap.containsKey(s.charAt(i))) {

                hMap.put(s.charAt(i), 1);
                
            }
            else{

                hMap.put(s.charAt(i), hMap.get(s.charAt(i))+1);

            }

        }


        // Now make a string builder

        StringBuilder sb = new StringBuilder();

        for(char ch = 'a' ; ch <= 'z' ; ch++){

            if (hMap.containsKey(ch)) {

                sb.append(ch);
                
            }

        }

        String str = sb.toString();

        return str;
        
    }


    public static void main(String[] args) {
        
        RemoveDuplicateLetters rd = new RemoveDuplicateLetters();

        String s = "cbacdcbc";

        String ans = rd.removeDuplicateLetters(s);

        System.out.println(ans);
    }
}
