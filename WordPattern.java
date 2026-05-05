import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] ch = pattern.toCharArray();
        String[] words = s.split(" ");
        int n = ch.length;
        if (words.length != n) {
            return false;
        }
        // In these types of problems u have to check the mapping two ways 
        // char to word a--->dog  b--->cat
        // word to char dog--->a cat--->b

        // This is why two hashmaps are required
        HashMap<Character,String> charToWord = new HashMap<>();
        HashMap<String,Character> wordTochar = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
          if (!charToWord.containsKey(ch[i])) {
            charToWord.put(ch[i], words[i]);
          }else{
            if (!charToWord.get(ch[i]).equals(words[i])) {
                return false;
            }
          }

          //2nd map matching
          if (!wordTochar.containsKey(words[i])) {
            wordTochar.put(words[i], ch[i]);
          }else{
            if (!wordTochar.get(words[i]).equals(ch[i])) {
                return false;
            }
          }
        }

        return true;
    }public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean ans = wp.wordPattern(pattern, s);
        System.out.println(ans);
    }
}
