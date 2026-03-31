import java.util.ArrayList;


public class ReverseVowelsInAString {
    
    public String reverseVowels(String s) {

        ArrayList<Integer> idxList = new ArrayList<>();
        ArrayList<Character> chList = new ArrayList<>();

        // Filling both the list according to the coming of vowel in the string

        for(int i = 0; i < s.length() ; i++){

            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {

                idxList.add(i);
                chList.add(s.charAt(i));
                
            }

            if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {

                idxList.add(i);
                chList.add(s.charAt(i));
                
            }

            if (s.charAt(i) == 'i' || s.charAt(i) == 'I') {

                idxList.add(i);
                chList.add(s.charAt(i));
                
            }

            if (s.charAt(i) == 'o' || s.charAt(i) == 'O') {

                idxList.add(i);
                chList.add(s.charAt(i));
                
            }

            if (s.charAt(i) == 'u' || s.charAt(i) == 'U') {

                idxList.add(i);
                chList.add(s.charAt(i));
                
            }



        }

        // Reversing the list 

        char[] ch = new char[chList.size()];

        for(int i = 0 ; i < ch.length ; i++){

            ch[i] = chList.get(chList.size()-1-i);

        }

        // Making the modified string
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for(int i = 0 ; i < s.length() ; i++){

            if (idx < idxList.size() && i == idxList.get(idx)) {

                sb.append(ch[idx]);
                idx++;
                
            }

            else{

                sb.append(s.charAt(i));

            }

            

        }

        String str = sb.toString();

        return str;
        
    }


    public static void main(String[] args) {
        
        ReverseVowelsInAString rv = new ReverseVowelsInAString();

        String s = "leetcode";
        String ans = rv.reverseVowels(s);

        System.out.println(ans);
    }
}
