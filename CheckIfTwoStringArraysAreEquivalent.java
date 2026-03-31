public class CheckIfTwoStringArraysAreEquivalent {
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0 ; i < word1.length ; i++){

            sb1.append(word1[i]);

        }

        String strWord1 = sb1.toString();

        for(int i = 0 ; i < word2.length ; i++){

            sb2.append(word2[i]);

        }

        String strWord2 = sb2.toString();

        if (strWord1.equals(strWord2)) {

            return true;
            
        }
        
        return false;

    }


    public static void main(String[] args) {
        
        CheckIfTwoStringArraysAreEquivalent cc = new CheckIfTwoStringArraysAreEquivalent();

        String[] word1 = {"abc", "d", "defg"};

        String[] word2 = {"abcddefg"};

        boolean ans = cc.arrayStringsAreEqual(word1, word2);

        System.out.println(ans);

        
    }
}
