import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {



    public void buildAMap(HashMap<Character,String> hMap){

        // Now put all the mapping in the given question
        hMap.put('2', "abc");
        hMap.put('3', "def");
        hMap.put('4', "ghi");
        hMap.put('5', "jkl");
        hMap.put('6', "mno");
        hMap.put('7', "pqrs");
        hMap.put('8', "tuv");
        hMap.put('9', "wxyz");
        
        

    }

    public void helprLC(List<String> lst , String digit ,HashMap<Character,String> hMap ,StringBuilder sb , int idx ){

        if (idx == digit.length()) {

            lst.add(sb.toString());
            return;
            
        }

        char c = digit.charAt(idx);
        String str = hMap.get(c);

        // Now traverse over this string to get all the combination with in the string 
        for(int i = 0 ; i < str.length() ; i++){

            sb.append(str.charAt(i));
            helprLC(lst, digit, hMap, sb, idx+1);
            sb.deleteCharAt(sb.length()-1);         // This is the backtracking thing

        }




    }
    
    public List<String> letterCombinations(String digits) {

        // The pattern that u have observed in the permutation thing will be applied here 
        // Bcz the number of combination depend on the length of the digits

        HashMap<Character,String> hMap = new HashMap<>();
        buildAMap(hMap);

        List<String> lst = new ArrayList<>();
        if(digits.length() == 0){
            lst.add("");
            return lst;
        }

        int idx = 0;
        
        StringBuilder sb = new StringBuilder();

        helprLC(lst, digits, hMap, sb, idx);

        return lst;
        
    }


    public static void main(String[] args) {
        
        LetterCombinationOfAPhoneNumber lcp = new LetterCombinationOfAPhoneNumber();

        String digits = "";
        List<String> lst = lcp.letterCombinations(digits);

        System.out.println(lst);
    }
}
