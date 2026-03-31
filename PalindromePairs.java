import java.util.ArrayList;
import java.util.List;

public class PalindromePairs {

    public  boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> list = new ArrayList<>()

        // the first approach i am thinking off but this is wrongggggggggggggggg
        for(int i = 0 ; i < words.length ; i++){

            List<Integer> lst = new ArrayList<>();

            for(int j = 0 ; j < words.length ; j++){

                if (i != j) {

                    if (isPalindrome(words[i] + words[j])) {

                        lst.add(i);
                        lst.add(j);
                        
                        
                    }
   
                }

                

            }

            list.add(lst);

            
        }


        return list;


        
    }

    public static void main(String[] args) {
        
        PalindromePairs pp = new PalindromePairs();

        String[] words = {"a","abc","aba",""};

        List<List<Integer>> ans = pp.palindromePairs(words);

        System.out.println(ans);
    }
}
