public class CheckIfTheSentenceIsAPangramOrNot {
    
    public boolean checkIfPangram(String sentence) {

        boolean ifPangram = false;

        for(char c = 'a' ; c <= 'z' ; c++){

            boolean isFound = false;

            for(int i = 0 ; i < sentence.length() ; i++){

                if (sentence.charAt(i) == c) {

                    isFound = true;
                    break;
                    
                }

            }

            if (isFound) {

                ifPangram = true;
                
            }
            else{

                ifPangram = false;
                break;

            }

        }

        return ifPangram;

        
    }

    public static void main(String[] args) {
        
        CheckIfTheSentenceIsAPangramOrNot cc = new CheckIfTheSentenceIsAPangramOrNot();

        String sentence = "hxsdz";

        boolean isPangram = cc.checkIfPangram(sentence);

        System.out.println(isPangram);
    }
}
