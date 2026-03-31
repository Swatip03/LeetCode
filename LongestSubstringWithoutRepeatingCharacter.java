import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
    
    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;

        int i = 0;
        int j = 0;

        HashMap<Character,Integer> hmap = new HashMap<>();

        while (j < s.length()) {

            if (!hmap.containsKey(s.charAt(j))) {

                hmap.put(s.charAt(j), j);
                
            }
            else{

                if (hmap.get(s.charAt(j)) >= i) {

                    i = hmap.get(s.charAt(j))+1;    // This is where i was stuck on how to update the i pointer
                    
                }
                hmap.put(s.charAt(j), j);       // Update the idx of the character in the array

            }

            maxLen = Math.max(maxLen, j-i+1);
            j++;
            
        }


        return maxLen;


        
    }

    public static void main(String[] args) {
        
        LongestSubstringWithoutRepeatingCharacter ls = new LongestSubstringWithoutRepeatingCharacter();

        String s = "abba";

        int ans = ls.lengthOfLongestSubstring(s);

        System.out.println(ans);
    }
}
