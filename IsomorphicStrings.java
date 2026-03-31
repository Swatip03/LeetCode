import java.util.HashSet;

public class IsomorphicStrings {
    
    public boolean isIsomorphic(String s, String t) {

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(int i = 0; i < s.length() ; i++){

            set1.add(s.charAt(i));

        }

        for(int j = 0 ; j < t.length() ; j++){

            set2.add(t.charAt(j));

        }

        if (set1.size() == set2.size()) {

            return true;
            
        }
        

        return false
    }

    public static void main(String[] args) {

        IsomorphicStrings is = new IsomorphicStrings();
        
        String s = "foo";
        String t = "bar";

        boolean ans = is.isIsomorphic(s, t);

        System.out.println(ans);


    }
}
